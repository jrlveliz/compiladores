package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
 
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
		Log.logln("AST", padding + "FOR " + id);
		inicio.print(padding + "\tFROM ");
		fin.print(padding + "\tTO ");
		instrucciones.print(padding + "\t");
	}
	
	public void print(){
		print("");
	}
}