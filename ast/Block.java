package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class Block extends Node{
	private List<Var> varList;
	private List<Node> stmntList;
	
	public Block(){
		varList = new LinkedList<Var>();
		stmntList = new LinkedList<Node>();
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
			System.out.println("var decl ->");

			for(Var n : varList){
				sVarList += n.type + " " + n.id + ", ";
			}

			if(sVarList.endsWith(", "))
				sVarList = sVarList.replace(", ", "");

			sVarList += ";";
		}

		System.out.println(padding + sVarList);

		for(Node stmnt : stmntList){
			stmnt.print(padding);
		}
	}
	
	public void print(){
		print("");
	}
}