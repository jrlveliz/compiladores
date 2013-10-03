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
			root.add(visit(field));
		}

		List<DecafParser.Method_declContext> methodList = ctx.method_decl();

		for(DecafParser.Method_declContext method : methodList){
			root.add(visit(method));
		}

		return root;
	}

	@Override
	public Node visitField_decl(DecafParser.Field_declContext ctx){
		DecafParser.TypeContext type = ctx.type();
		Field field = new Field(type);

		List<DecafParser.Var_decl_nameContext> varList = ctx.var_decl_name();

		for(DecafParser.Var_decl_nameContext variable : varList){
			field.add(visit(variable))
		}

		
		return field;
	}

	@Override
	public Node visitField_decl(DecafParser.Field_declContext ctx)
}