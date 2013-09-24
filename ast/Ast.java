package compiler.ast;
import compiler.lib.*;
import compiler.parser.*;
import compiler.semantic.*;
import org.antlr.v4.runtime.tree.*;

public class Ast{
	private String sStage;
	private	CC4Parser parser; 
	public Ast(CC4Parser parser1){
		sStage = "ast"; // Who am I?
		parser = parser1;
		//Log.write("stage: [ast]");
		//System.out.println("stage: [ast]");
		Debug.print("debug: [ast]", sStage);
	}

	public Root start(){
		ParseTree tree = parser.GetParseTree();
		AstVisitor visitor = new AstVisitor();
		Root root = (Root)visitor.visit(tree);

		return root;
	}
}