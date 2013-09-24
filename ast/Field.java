package compiler.ast;

class Field extends Node{
	private String type;
	private Node var_list;

	public Field(String type, Node var_list){
		this.type = type;
		this.var_list = var_list;
	}

}