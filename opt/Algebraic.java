package compiler.opt;
import compiler.lib.*;
import compiler.irt.*;

public class Algebraic{
	private String sStage;

	public Algebraic(Irt irt1){
		sStage = "algebraic"; // Who am I?

		//Log.write("optimizing: [algebraic]");
		//System.out.println("optimizing: [algebraic]");
		Debug.print("optimizing-debug: [algebraic]", sStage);
	}
}