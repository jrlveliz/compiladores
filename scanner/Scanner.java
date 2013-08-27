package compiler.scanner;
import java.io.*;
import compiler.lib.*;
import compiler.*;
import compiler.parser.*;
import org.antlr.v4.runtime.*;

public class Scanner{
	private String sInputFile;
	private String sInput;
	private String sStage;

	public Scanner(String sFileName){
		sStage = "scan"; // Who am I?
		sInputFile = sFileName;
		//FileInputStream flInput = FileInputStream(sFileName);

		Log.write("stage: [scanner]");
		System.out.println("stage: [scanner]");
		Debug.print("debug: [scanner]", sStage);

	try {
			DecafLexer lexer = new DecafLexer(new ANTLRFileStream(sFileName));
			Token tk = lexer.nextToken();

			while(tk.getType() != Token.EOF){
				if(tk.getType() == DecafLexer.WHITESPACE){
					System.out.println("");
				}else{
					System.out.print(lexer.ruleNames[tk.getType() - 1] + " ");
				}

				tk = lexer.nextToken();
			}
			
			System.out.println("");

		} catch (Exception e) {
			System.err.println("usage: DecafLexer <file>\nwhere file is the path to the filename with the tokens");
			System.exit(1);
		}

		if(!Debug.target.equals(sStage)){
			CC4Parser parser1 = new CC4Parser(this);
		}
	}

	public String GetFileName(){
		return sInputFile;
	}
}