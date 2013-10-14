package compiler.ast;
 
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;
 
public class AstVisitor extends DecafParserBaseVisitor<Node>{
	
	@Override
	public Node visitClass(DecafParser.ClassContext ctx){
		Root root = new Root();
		List<DecafParser.Field_declContext> fieldList = ctx.field_decl();

		for(DecafParser.Field_declContext field : fieldList){
			root.addField((Field)visit(field));
		}

		List<DecafParser.Method_declContext> methodList = ctx.method_decl();

		for(DecafParser.Method_declContext method : methodList){
			root.addMethod((Method)visit(method));
		}

		return root;
	}

	@Override
	public Node visitField_decl(DecafParser.Field_declContext ctx){
		DecafParser.TypeContext type = ctx.type();
		TerminalNode sType = type.INT() == null ? type.BOOLEAN() : type.INT();

		Field field = new Field(sType.getText());

		List<DecafParser.Var_decl_nameContext> varList = ctx.var_decl_name();

		for(DecafParser.Var_decl_nameContext variable : varList){
			if(variable.INT_LIT() == null){ // Es variable
				field.addVar(variable.ID().getText());
			}else{ // Es arreglo
				field.addArray(variable.ID().getText(), Integer.parseInt(variable.INT_LIT().getText()));
			}
		}

		return field;
	}

	@Override
	public Node visitMethod_decl(DecafParser.Method_declContext ctx){
		DecafParser.TypeContext type = ctx.type();
		TerminalNode voidType = ctx.VOID();
		TerminalNode methodID = ctx.ID();
		String sMethodType = "";
		String sParamType = "";

		if(type == null){
			sMethodType = voidType.getText();
		}else{
			sMethodType = (type.INT() == null ? type.BOOLEAN().getText() : type.INT().getText());
		}

		Method mth = new Method(sMethodType, methodID.getText(), visit(ctx.block()));

		List<DecafParser.Param_declContext> paramList;

		if(ctx.parametros() != null){
			paramList = ctx.parametros().param_decl();
		
			for (DecafParser.Param_declContext parametro : paramList) { 
				sParamType = (parametro.type().INT() == null ? parametro.type().BOOLEAN().getText() : parametro.type().INT().getText());
				mth.addParam(sParamType, parametro.ID().getText());
			}
		}
		return mth;
	}

	@Override
	public Node visitBlock(DecafParser.BlockContext ctx){
		Block block = new Block();
		List<DecafParser.Var_declContext> varList = ctx.var_decl();

		for(DecafParser.Var_declContext var : varList){
			String sVarType = (var.type().INT() == null ? var.type().BOOLEAN().getText() : var.type().INT().getText());
			List<TerminalNode> idList = var.ID();

			for (TerminalNode varID : idList) {
				block.addVar(new Var(sVarType, varID.getText()));
			}
		}

		List<DecafParser.StatementContext> statementList = ctx.statement();

		for(DecafParser.StatementContext statement : statementList){
			block.addStatement((Statement)visit(statement));
		}

		return block;
	}
}