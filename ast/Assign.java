package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
 
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
		Log.logln("AST", padding + assignOp);
		location.print(padding + "\t");
		expr.print(padding + "\t");
	}
	
	public void print(){
		print("");
	}
}