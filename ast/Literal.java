package compiler.ast;

public class Literal extends Node{
	public Object lit;
	public String type;

	public Literal(String value, String type){
		switch(type){
			case "INT" :
				lit = Integer.parseInt(value);
				break;
			case "BOOLEAN" : 
				lit = Boolean.parseBoolean(value);
				break;
			case "CHAR" :
				lit = value.replace("'", "");
				break;
			default :
				lit = null;
		}

		this.type = type;
	}

	public void print(String padding){
		System.out.println("LITERAL -> " + lit);
	}
	
	public void print(){
		print("");
	}
}