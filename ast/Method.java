package compiler.ast;

class Method extends Node{
	private String type;
	private String id;
	private LinkedList<Var> param_list;
	private Node block;

	public Method(String type, String id, Node block){
		param_list = new LinkedList<Var>();
		this.type = type;
		this.id = id;
		this.block = block;
	}


	public void addParam(String type, String param){
		param_list.add(new Var(type, param))
	}

	public void print(){
		String sParmList = "";

		for (Var x : param_list) {
			sParamList += ", " + (x.style == "PARAMETRO" ? x.type + x.id);
		}

		System.out.println(padding + type + sVarList);
	}

}