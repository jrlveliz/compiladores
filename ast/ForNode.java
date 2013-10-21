package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class ForNode extends Node{
	private String id;
	private Node inicio;
	private Node fin;
	private Node instrucciones;
	
	public ForNode(String id, Node inicio, Node fin, Node instrucciones){
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.instrucciones = instrucciones;
	}

	public void print(String padding){
		System.out.print(padding + "FOR " + id);
		inicio.print(" :");
		fin.print("");
		System.out.println(padding + "\t->");
		instrucciones.print(padding + "\t\t");
	}
	
	public void print(){
		print("");
	}
}