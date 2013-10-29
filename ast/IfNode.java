package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
 
public class IfNode extends Node{
	private Node nCondition;
	private Node bConsec;
	private Node bAltern;
	
	public IfNode(Node nCondition, Node bConsec, Node bAltern){
		this.nCondition = nCondition;
		this.bConsec = bConsec;
		this.bAltern = bAltern;
	}

	public void print(String padding){
		Log.logln("AST", padding + "IF ");
		nCondition.print(padding + "\t");
		Log.logln("AST", padding + "THEN ->");
		bConsec.print(padding + "\t");

		if(bAltern != null){
			Log.logln("AST", padding + "ELSE ->");
			bAltern.print(padding + "\t");
		}

		Log.logln("AST", padding + "ENDIF\n");
	}
	
	public void print(){
		print("");
	}

	public boolean check(Node parent){
		this.parent = parent;

		return bConsec.check(this) && (bAltern == null ? true : bAltern.check(this));
	}
}