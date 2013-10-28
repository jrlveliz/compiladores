package compiler.semantic;
import compiler.lib.*;
import compiler.ast.*;
import compiler.irt.*;

public class Semantic{
	private String sStage;
	private Ast ast;
	public static Symtab st;
	public static int iCtxCount = 0;

	public Semantic(Ast ast1){
		sStage = "semantic"; // Who am I?
		this.ast = ast1;
		//Log.write("stage: [semantic]");
		//System.out.println("stage: [semantic]");
		Debug.print("debug: [semantic]", sStage);

		st = new Symtab();
	}

	public void start(){
		Root rootNode = ast.start();
		System.out.println(rootNode.check(null));
	}

	public void addVar(String idScope, Symbol.SymType tType, String sID){
		st.addVariable(idScope, tType, sID);
	}
}