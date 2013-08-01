package compiler.opt;
import compiler.lib.*;
import compiler.irt.*;

public class ConstantFolding{
	private String sStage;

	public ConstantFolding(Irt irt1){
		sStage = "constantfolding"; // Who am I?

		Log.write("optimizing: [constant folding]");
		System.out.println("optimizing: [constant folding]");
		Debug.print("optimizing-debug: [constant folding]", sStage);
	}
}