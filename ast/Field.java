package compiler.ast;

import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;

public class Field extends Node{
	private String type;
	private LinkedList<Var> var_list;

	public Field(String type){
		var_list = new LinkedList<Var>();
		this.type = type;
	}

	public void addVar(String var){
		var_list.add(new Var(var));
	}

	public void addArray(String arrID, int length){
		var_list.add(new Var(arrID, length));
	}

	public void print(String padding){
		String sVarList = " ";

		for (Var x : var_list) {
			sVarList += (x.style == "ARRAY" ? x.id + "[" + x.length + "]" : x.id) + ", ";
		}

		if(sVarList.endsWith(", "))
			sVarList = sVarList.substring(0, sVarList.length() - 2) + ";";

		Log.logln("AST", padding + type + sVarList);
	}
}