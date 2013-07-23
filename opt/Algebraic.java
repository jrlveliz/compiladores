package compiladores.opt;
import compiladores.lib.*;
import compiladores.irt.*;

public class Algebraic{
	private String sStage;

	public Algebraic(Irt irt1){
		sStage = "algebraic"; // Who am I?

		Log.write("optimizing: [algebraic]");
		System.out.println("optimizing: [algebraic]");
		Debug.print("optimizing-debug: [algebraic]", sStage);
	}
}