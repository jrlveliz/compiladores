package compiler.ast;
import compiler.lib.*;
 
public class BinOp extends Node{
	private String operator;
	private Node left;
	private Node right;
	
	public BinOp(String op, Node l, Node r){
		operator = op;
		left = l;
		right = r;
	}
	
	public void print(String padding){
		Log.logln("AST", padding + operator);
		
		if(left != null)
			left.print(padding + "\t");
		
		right.print(padding + "\t");
	}

	public boolean check(Node parent){
		return true;
	}
} 