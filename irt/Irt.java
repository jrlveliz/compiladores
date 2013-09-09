package compiler.irt;
import compiler.lib.*;
import compiler.semantic.*;
import compiler.codegen.*;
import compiler.opt.*;

public class Irt{
	private String sStage;

	public Irt(Semantic semantic1){
		sStage = "irt"; // Who am I?

		//Log.write("stage: [irt]");
		//System.out.println("stage: [irt]");
		Debug.print("debug: [irt]", sStage);

		if(Debug.optimization.equals("algebraic")){
			Algebraic algOpt = new Algebraic(this);
		}else if(Debug.optimization.equals("constantfolding")){
			ConstantFolding cfOpt = new ConstantFolding(this);
		}

		// Verificamos si hasta aquí tiene que llegar
		if(!Debug.target.equals(sStage)){
			Codegen codegen1 = new Codegen(this);
		}
	}
}