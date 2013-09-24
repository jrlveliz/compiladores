package compiler.parser;
import compiler.lib.*;
import compiler.*;
import compiler.scanner.*;
import compiler.ast.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CC4Parser{
	private String sStage;
	private DecafLexer lexer;
	private DecafParser parser;
	private ParseTree tree;

	public CC4Parser(Scanner scanner1){
		sStage = "parse"; // Who am I?

		//Log.write("stage: [parser]");
		//System.out.println("stage: [parser]");
		Debug.print("debug: [parser]", sStage);

		lexer = null;
		parser = null;

		try{
			lexer = new DecafLexer(new ANTLRFileStream(scanner1.GetFileName()));
		}catch(Exception ex){
			System.out.println("ERROR: El archivo enviado como parámetro no existe.");
		}
	}

	public ParseTree parse(){
		CommonTokenStream tokens;

		if(lexer != null){
			tokens = new CommonTokenStream(lexer);
			parser = new DecafParser(tokens);

			parser.program();
		}

		tree = parser.program();
		return tree;
	}

	public static void detectRule(String sRule){
		System.out.println(sRule + " detected.");
	}

	public ParseTree GetParseTree(){
		return tree;
	}
}