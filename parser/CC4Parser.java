package compiler.parser;
import compiler.lib.*;
import compiler.*;
import compiler.scanner.*;
import compiler.ast.*;

public class CC4Parser{
	private String sStage;

	public CC4Parser(Scanner scanner1){
		sStage = "parse"; // Who am I?

		Log.write("stage: [parser]");
		System.out.println("stage: [parser]");
		Debug.print("debug: [parser]", sStage);

		if(!Debug.target.equals(sStage)){
			Ast ast1 = new Ast(this);
		}
	}
}