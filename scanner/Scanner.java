package compiladores.scanner;
import java.io.*;
import compiladores.lib.*;
import compiladores.*;
import compiladores.parser.*;

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

		if(!Debug.target.equals(sStage)){
			CC4Parser parser1 = new CC4Parser(this);
		}
	}
}