package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
import compiler.semantic.*;
 
public class Block extends Node{
	private List<Var> varList;
	private List<Node> stmntList;
	private int iCountCtx;
	private String sCtxID;
	public Node parent;

	public Block(){
		varList = new LinkedList<Var>();
		stmntList = new LinkedList<Node>();
		sCtxID = "";
		iCountCtx = 0;
	}
	
	public void addVar(Var var){
		varList.add(var);
	}

	public void addStatement(Node stmnt){
		stmntList.add(stmnt);
	}
	
	public void print(String padding){
		String sVarList = "";

		if(varList.size() > 0){
			Log.logln("AST", padding + "var decl ->");

			for(Var n : varList){
				sVarList += n.type + " " + n.id + ", ";
			}

			if(sVarList.endsWith(", "))
				sVarList = sVarList.substring(0, sVarList.length() - 2) + ";";
		}

		Log.logln("AST", padding + "\t" + sVarList);

		for(Node stmnt : stmntList){
			stmnt.print(padding);
		}
	}
	
	public void print(){
		print("");
	}

	public boolean check(Node parent){
		boolean valid = true;
		this.parent = parent;

		if(parent instanceof Method){
			sCtxID = ((Method)parent).id;
		}else if(parent instanceof IfNode || parent instanceof ForNode){
			((Block)(parent.parent)).iCountCtx++;
			System.out.println(parent.getClass().toString());
			sCtxID = ((Block)(parent.parent)).sCtxID + "." + ((Block)(parent.parent)).iCountCtx;
		}else{
			((Block)parent).iCountCtx++;
			sCtxID = ((Block)parent).sCtxID + "." + ((Block)parent).iCountCtx;
		}

		System.out.println("NUEVO CONTEXTO: " + sCtxID);

		for (Var var : varList) {
			valid &= Semantic.st.addVariable(sCtxID, Symbol.checkType(var.type), var.id);
		}

		for(Node stmnt : stmntList){
			valid &= stmnt.check(this);
		}

		return valid;
	}
}