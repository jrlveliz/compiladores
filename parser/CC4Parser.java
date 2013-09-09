package compiler.parser;
import compiler.lib.*;
import compiler.*;
import compiler.scanner.*;
import compiler.ast.*;
import org.antlr.v4.runtime.*;

public class CC4Parser{
	private String sStage;

	public CC4Parser(Scanner scanner1){
		sStage = "parse"; // Who am I?

		//Log.write("stage: [parser]");
		//System.out.println("stage: [parser]");
		Debug.print("debug: [parser]", sStage);

		DecafLexer lexer = null;

		try{
			lexer = new DecafLexer(new ANTLRFileStream(scanner1.GetFileName()));
		}catch(Exception ex){
			System.out.println("ERROR: El archivo enviado como parámetro no existe.");
		}

		CommonTokenStream tokens;
		DecafParser parser;

		if(lexer != null){
			tokens = new CommonTokenStream(lexer);
			parser = new DecafParser(tokens);

			parser.program();
		}

		// 	if(!Debug.target.equals(sStage)){
		// 		Ast ast1 = new Ast(this);
		// 	}
	}

	public static void detectRule(String sRule){
		System.out.println(sRule + " detected.");
	}
}