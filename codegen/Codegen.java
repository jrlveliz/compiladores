package compiladores.codegen;
import compiladores.lib.*;
import compiladores.irt.*;

public class Codegen{
	private String sStage;

	public Codegen(Irt irt1){
		sStage = "codegen"; // Who am I?

		Log.write("stage: [codegen]");
		System.out.println("stage: [codegen]");
		Debug.print("debug: [codegen]", sStage);
	}
}