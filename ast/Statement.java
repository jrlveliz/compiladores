package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
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
		System.out.println(padding + statementType);
		expReturn.print(padding);
	}
	
	public void print(){
		print("");
	}
}