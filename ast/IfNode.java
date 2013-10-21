package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
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
		System.out.print(padding + "IF ");
		nCondition.print("");
		System.out.println(padding + "\tTHEN ->");
		bConsec.print(padding + "\t\t");

		if(bAltern != null){
			System.out.println(padding + "\tELSE ->");
			bAltern.print(padding + "\t\t");
		}
	}
	
	public void print(){
		print("");
	}
}