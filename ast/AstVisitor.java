package compiler.ast;
 
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;
 
public class AstVisitor extends DecafParserBaseVisitor<Node>{
	
	@Override
	public Node visitLine(DecafParser.LineContext ctx){
		Root root = new Root();
		List<DecafParser.ExpContext> list = ctx.exp();
		
		for(DecafParser.ExpContext e : list){
			root.add(visit(e));
		}
		return root;
	}
	
	@Override
	public Node visitInt(DecafParser.IntContext ctx){
		return new IntLiteral(ctx.INTEGER().getText());
	}
	
	@Override
	public Node visitParen(DecafParser.ParenContext ctx){
		return visit(ctx.exp());
	}
	
	@Override
	public Node visitPlusMinus(DecafParser.PlusMinusContext ctx){
		TerminalNode op = ctx.MINUS() == null ? ctx.PLUS() : ctx.MINUS();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}
	
	@Override
	public Node visitTimesDiv(DecafParser.TimesDivContext ctx){
		TerminalNode op = ctx.DIV() == null ? ctx.TIMES() : ctx.DIV();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}
}