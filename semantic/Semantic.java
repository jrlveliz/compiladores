package compiladores.semantic;
import compiladores.lib.*;
import compiladores.ast.*;
import compiladores.irt.*;

public class Semantic{
	private String sStage;

	public Semantic(Ast ast1){
		sStage = "semantic"; // Who am I?

		Log.write("stage: [semantic]");
		System.out.println("stage: [semantic]");
		Debug.print("debug: [semantic]", sStage);

		// Verificamos si hasta aquí tiene que llegar
		if(!Debug.target.equals(sStage)){
			Irt irt1 = new Irt(this);
		}
	}
}