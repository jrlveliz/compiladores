package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class Block extends Node{
	private List<Var> varList;
	private List<Statement> stmntList;
	
	public Block(){
		varList = new LinkedList<Var>();
		stmntList = new LinkedList<Statement>();
	}
	
	public void addVar(Var var){
		varList.add(var);
	}

	public void addStatement(Statement stmnt){
		stmntList.add(stmnt);
	}
	
	public void print(String padding){
		String sVarList = "";

		if(varList.size() > 0){
			System.out.println("var decl ->");

			for(Var n : varList){
				sVarList += n.type + " " + n.id + ", ";
			}
		}

		System.out.println(padding + sVarList);

		for(Statement stmnt : stmntList){
			System.out.println("Statement ->" + stmnt);
			stmnt.print(padding + "\t");
		}
	}
	
	public void print(){
		print("");
	}
}