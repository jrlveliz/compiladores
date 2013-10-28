package compiler.ast;

import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
import compiler.semantic.*;

class Method extends Node{
	public String type;
	public String id;
	public LinkedList<Var> param_list;
	public Node block;

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

		if(sParamList.endsWith(", "))
			sParamList = sParamList.substring(0, sParamList.length() - 2) + ";";

		Log.logln("AST", padding + type + " " + id + "(): " + (sParamList == "" ? "[NO_PARAM]" : sParamList));
		block.print(padding + "\t");
	}

	public boolean check(Node parent){
		boolean valid = true;
		Symbol mtd = new Symbol(Symbol.checkType(type), id);

		for (Var var : param_list) {
			valid &= mtd.addParam(id, Symbol.checkType(var.type), var.id);
		}

		valid &= Semantic.st.addMethod(mtd) && block.check(this);

		return valid;
	}
}