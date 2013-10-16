package compiler.ast;

public class Var extends Node{
	public String id;
	public int length;
	public String style;
	public String type;
	public Node exprLength;

	public Var(String id, int length){
		this.style = "ARRAY";
		this.id = id;
		this.length = length;
	}

	public Var(String id, Node length){
		this.style = "ARRAY";
		this.id = id;
		this.exprLength = length;
	}

	public Var(String id){
		this.style = "VARIABLE";
		this.id = id;
	}

	public Var(String type, String id){
		this.style = "PARAMETRO";
		this.type = type;
		this.id = id;
	}

	public void print(String padding){
		
	}
	
	public void print(){
		print("");
	}
}