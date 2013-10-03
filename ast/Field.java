package compiler.ast;

import java.util.List;
import java.util.LinkedList;

class Field extends Node{
	private String type;
	private List<String> var_list;

	public Field(String type){
		this.type = type;
	}

	public void add(String vars){
		var_list.add(vars)
	}

	
}