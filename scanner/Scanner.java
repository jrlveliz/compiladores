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

		//Log.write("stage: [scanner]");
		//System.out.println("stage: [scanner]");
	}

	public void Scan(){
		Debug.print("debug: [scanner]", sStage);

		if(!Debug.target.equals(sStage)){
			CC4Parser parser1 = new CC4Parser(this);

			parser1.parse();
		}else{
			try {
				DecafLexer lexer = new DecafLexer(new ANTLRFileStream(sFileName));
				Token tk = lexer.nextToken();
				String sOut = "Linea\t\t" + "Token\t\t" + "Lexema\t\t\n";

				while(tk.getType() != Token.EOF){

					sOut += tk.getLine() + "\t\t" + lexer.ruleNames[tk.getType() - 1] + "\t\t" + tk.getText() + "\n";

					tk = lexer.nextToken();
				}

				Log.write(sOut);
				Debug.print(sOut, sStage);

			} catch (Exception e) {
				System.err.println("usage: DecafLexer <file>\nwhere file is the path to the filename with the tokens");
				System.exit(1);
			}
		}
	}

	public String GetFileName(){
		return sInputFile;
	}
}