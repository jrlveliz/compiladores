package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class Statement extends Node{
	String statementType;
	Nodo expReturn

	public Statement(String type){
		this.statementType = type;
	}

	public Statement(Node expReturn){
		this.statementType = "RETURN";
		this.expReturn = expReturn;
	}

	public void print(String padding){
	}
	
	public void print(){
		print("");
	}
}