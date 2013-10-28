package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
 
public class Statement extends Node{
	String statementType;
	Node expReturn;

	public Statement(String type){
		this.statementType = type;
	}

	public Statement(Node expReturn){
		this.statementType = "RETURN";
		this.expReturn = expReturn;
	}

	public void print(String padding){
		Log.logln("AST", padding + statementType);

		if(expReturn != null)
			expReturn.print(padding + "\t");
		else
			Log.logln("AST", "");
	}
	
	public void print(){
		print("");
	}

	public boolean check(Node parent){
		return true;
	}
}