package compiladores.irt;
import compiladores.lib.*;
import compiladores.semantic.*;
import compiladores.codegen.*;

public class Irt{
	private String sStage;

	public Irt(Semantic semantic1){
		sStage = "irt"; // Who am I?

		Log.write("stage: [irt]");
		System.out.println("stage: [irt]");
		Debug.print("debug: [irt]", sStage);

		// Verificamos si hasta aquí tiene que llegar
		if(!Debug.target.equals(sStage)){
			Codegen codegen1 = new Codegen(this);
		}
	}
}