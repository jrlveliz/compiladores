package compiler.ast;

import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;

class MethodCall extends Node{
	private String id;
	private LinkedList<Node> argList;
	private String sCallType;

	public MethodCall(String id, String sCallType){
		this.argList = new LinkedList<Node>();
		this.id = id;
		this.sCallType = sCallType;
	}


	public void addArg(Node expr){
		argList.add(expr);
	}

	public void print(String padding){
		if(sCallType == "CALLOUT")
			Log.logln("AST", padding + sCallType + " function: " + id.replace("\"", ""));
		else
			Log.logln("AST", padding + id + "()");

		if(argList.size() > 0)
			Log.logln("AST", padding + "\tParams:");

		for (Node arg : argList) {
			arg.print(padding + "\t\t");
		}
	}

	public boolean check(Node parent){
		return true;
	}
}