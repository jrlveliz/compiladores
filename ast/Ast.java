package compiler.ast;
import compiler.lib.*;
import compiler.parser.*;
import compiler.semantic.*;

public class Ast{
	private String sStage;

	public Ast(CC4Parser parser1){
		sStage = "ast"; // Who am I?

		//Log.write("stage: [ast]");
		//System.out.println("stage: [ast]");
		Debug.print("debug: [ast]", sStage);

		ParseTree tree = parser1.parse();
		// Verificamos si hasta aquí tiene que llegar
		if(!Debug.target.equals(sStage)){
			Semantic semantic1 = new Semantic(this);
		}
	}
}