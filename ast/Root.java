package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
import compiler.lib.*;
 
public class Root extends Node{
	private List<Field> fieldList;
	private List<Method> methodList; 
	
	public Root(){
		fieldList = new LinkedList<Field>(); // Un field contiene varias variables
		methodList = new LinkedList<Method>();
	}

	public void addField(Field node){
		fieldList.add(node);
	}
	
	public void addMethod(Method node){
		methodList.add(node);
	}
	
	public void print(String padding){
		for(Node n : fieldList){
			Log.logln("AST", "field decl ->");
			n.print(padding + "\t");
		}

		for(Node n : methodList){
			Log.logln("AST", "method decl ->");
			n.print(padding + "\t");
		}
	}
	
	public void print(){
		print("");
	}
}