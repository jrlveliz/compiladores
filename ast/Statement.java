package compiler.ast;
 
import java.util.List;
import java.util.LinkedList;
 
public class Statement extends Node{
	private List<Field> fieldList;
	private List<Method> methodList; 
	
	public Statement(){
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
			System.out.println("field decl ->");
			n.print(padding + "\t");
		}

		for(Node n : methodList){
			System.out.println("method decl ->");
			n.print(padding + "\t");
		}
	}
	
	public void print(){
		print("");
	}
}