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
			// System.out.println("statement ast" + statement.location().ID().getText());
			block.addStatement(visit(statement));
		}

		return block;
	}

	@Override
	public Node visitAssign(DecafParser.AssignContext ctx){
		DecafParser.LocationContext loc = ctx.location();
		DecafParser.Assign_opContext asop = ctx.assign_op();
		DecafParser.ExprContext expr = ctx.expr();

		String sOp = (asop.ASSIGN_PLUS() != null ? asop.ASSIGN_PLUS().getText() : (asop.ASSIGN() != null ? asop.ASSIGN().getText() : asop.ASSIGN_SUBS().getText()));

		return new Assign(visit(loc), sOp, visit(expr));
	}

	@Override
	public Node visitMethodCall(DecafParser.MethodCallContext ctx){
		return new Statement("METHOD_CALL");
	}

	@Override
	public Node visitReturn_st(DecafParser.Return_stContext ctx){
		DecafParser.ExprContext expr = ctx.expr();

		return new Statement(expr != null ? visit(expr) : null);
	}

	@Override
	public Node visitContinue_st(DecafParser.Continue_stContext ctx){
		return new Statement("CONTINUE");
	}

	@Override
	public Node visitBreak_st(DecafParser.Break_stContext ctx){
		return new Statement("BREAK");
	}

	@Override
	public Node visitBlock_st(DecafParser.Block_stContext ctx){
		return visit(ctx.block());
	}

	@Override
	public Node visitMethod_call1(DecafParser.Method_call1Context ctx){
		String sMethodID = ctx.ID().getText();
		List<DecafParser.ExprContext> exprList = ctx.expr();

		MethodCall mc = new MethodCall(sMethodID, "METHOD");
		for (DecafParser.ExprContext expr : exprList) {
			mc.addArg(visit(expr));
		}

		return mc;
	}

	@Override
	public Node visitMethod_callout(DecafParser.Method_calloutContext ctx){
		String sCalloutID = ctx.STRING_LIT().getText();
		List<DecafParser.Callout_argContext> callArgList = ctx.callout_arg();

		MethodCall mc = new MethodCall(sCalloutID, "CALLOUT");
		for (DecafParser.Callout_argContext callArg : callArgList) {
			mc.addArg(visit(callArg));
		}

		return mc;
	}

	@Override
	public Node visitLocation(DecafParser.LocationContext ctx){
		TerminalNode locID = ctx.ID();
		DecafParser.ExprContext expr = ctx.expr();
		Var loc;

		if(expr != null)
			loc = new Var(locID.getText(), visit(expr));
		else
			loc = new Var(locID.getText());

		return loc;
	}

	@Override
	public Node visitCallout_arg(DecafParser.Callout_argContext ctx){
		DecafParser.ExprContext expr = ctx.expr();
		TerminalNode strLit = ctx.STRING_LIT();
		Node arg;

		if(expr == null)
			arg = new Var(strLit.getText());
		else
			arg = visit(expr);

		return arg;
	}
}