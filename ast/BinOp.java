package compiler.ast;
 
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
		System.out.println(padding + operator);
		
		if(left != null)
			left.print(padding + "\t");
		
		right.print(padding + "\t");
	}
} 