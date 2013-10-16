package compiler.ast;

import java.util.List;
import java.util.LinkedList;

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
			System.out.println(padding + sCallType + " " + id);
		else
			System.out.println(padding + id);

		System.out.print(padding);

		for (Node arg : argList) {
			arg.print(padding + "\n");
		}
	}
}