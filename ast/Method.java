package compiler.ast;

import java.util.List;
import java.util.LinkedList;

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
		param_list.add(new Var(type, param));
	}

	public void print(String padding){
		String sParamList = "";

		for (Var x : param_list) {
			sParamList += x.type + " " + x.id + ", ";
		}

		sParamList.replace(", \0", "\0");

		System.out.println(padding + type + " " + id + "(): " + (sParamList == "" ? "[NO_PARAM]" : sParamList));
		block.print(padding);
	}

}