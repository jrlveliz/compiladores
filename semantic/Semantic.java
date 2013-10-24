package compiler.semantic;
import compiler.lib.*;
import compiler.ast.*;
import compiler.irt.*;

public class Semantic{
	private String sStage;
	private Ast ast;

	public Semantic(Ast ast1){
		sStage = "semantic"; // Who am I?
		this.ast = ast1;
		//Log.write("stage: [semantic]");
		//System.out.println("stage: [semantic]");
		Debug.print("debug: [semantic]", sStage);

		// Verificamos si hasta aquí tiene que llegar
		if(!Debug.target.equals(sStage)){
			Irt irt1 = new Irt(this);
		}
	}

	public void start(){
		Root rootNode = ast.start();
	}
}