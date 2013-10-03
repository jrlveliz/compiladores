package compiler.ast;

class Method extends Node{
	private String type;
	private String id;
	private List<String> parametros;
	private Node String block;

	public Field(String type, String var_list){
		this.type = type;
		this.var_list = var_list;
	}


	public void add(String vars){
		var_list.ad(vars)
	}

}