package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class Assign extends Node{
	private Node location;
	private String assignOp;
	private Node expr;
	
	public Assign(Node location, String assignOp, Node expr){
		this.location = location;
		this.assignOp = assignOp;
		this.expr = expr;
	}
	
	public void print(String padding){
		location.print(padding);
		System.out.print(" " + assignOp);
		expr.print(padding);
	}
	
	public void print(){
		print("");
	}
}