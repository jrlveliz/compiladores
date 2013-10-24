package compiler.semantic;

import java.util.*;

public class Symtab{
	private Hashtable<String, Symbol> htSym;

	public Symtab(){
		htSym = new Hashtable<String, Symbol>();
	}

	public void addVariable(int iScope, SymType tType, String sID){
		if(htSym.contains(iScope + "," + sID)){
			System.out.println("Error! La variable " + sID + " ya esta definida.");
		}else{
			htSym.put(iScope + "," + sID, new Symbol(iScope, tType, sID));
		}
	}
}

class Symbol{
	public SymStyle style;
	public int scope;
	public SymType type;
	public String ID;
	
	public int length;
	
	public static int scopeCount = 0;
	public List<Symbol> parameters;

	// Constructor Variable
	public Symbol(int iScope, SymType sType, String sID){
		this.scope = iScope;
		this.type = sType;
		this.ID = sID;
		this.style = SymStyle.VARIABLE;
	}

	// Constructor Array
	public Symbol(SymType sType, String sID, int iLength){
		this.scope = 0; // Global Scope
		this.type = sType;
		this.ID = sID;
		this.length = iLength;
		this.style = SymStyle.ARRAY;
	}

	// Constructor Método
	public Symbol(SymType sType, String sID){
		this.scope = 0; // Global Scope
		this.type = sType;
		this.ID = sID;
		// this.length = iLength;
		this.style = SymStyle.ARRAY;
	}
}

enum SymStyle{
	METHOD, VARIABLE, ARRAY
}

enum SymType{
	INT, BOOLEAN, VOID
}