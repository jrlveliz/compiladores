package compiladores.parser;
import compiladores.lib.*;
import compiladores.*;
import compiladores.scanner.*;
import compiladores.ast.*;

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