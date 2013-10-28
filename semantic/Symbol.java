package compiler.semantic;

import java.util.*;

public class Symbol{
	public SymStyle style;
	public String scope;
	public SymType type;
	public String ID;
	
	public int length;
	
	public static int scopeCount = 0;
	public List<Symbol> parameters;
	public List<String> paramStr;

	// Constructor Variable
	public Symbol(String idScope, SymType sType, String sID){
		this.scope = idScope;
		this.type = sType;
		this.ID = sID;
		this.style = SymStyle.VARIABLE;
	}

	// Constructor Array
	public Symbol(SymType sType, String sID, int iLength){
		this.scope = "GLOBAL"; // Global Scope
		this.type = sType;
		this.ID = sID;
		this.length = iLength;
		this.style = SymStyle.ARRAY;
	}

	// Constructor Método
	public Symbol(SymType sType, String sID){
		this.scope = "GLOBAL"; // Global Scope
		this.type = sType;
		this.ID = sID;
		// this.length = iLength;
		this.style = SymStyle.METHOD;
		this.parameters = new LinkedList<Symbol>();
		this.paramStr = new LinkedList<String>();
	}

	// Agrega un parámetro al método declarado
	public boolean addParam(String sMethodID, SymType type, String sID){
		boolean valid = true;
		Symbol param = new Symbol(sMethodID, type, sID);

		if(this.paramStr.contains(sID)){
			valid = false;
			System.out.println("Parametro '" + sID + "' ya esta declarado para el metodo '" + sMethodID + "'");
		}
		// else {
		// 	this.parameters.add(param);
		// 	this.paramStr.add(sID);
		// }

		this.parameters.add(param);
		this.paramStr.add(sID);

		return valid;
	}

	public static SymType checkType(String sType){
		return sType.equals("int") ? Symbol.SymType.INT : sType.equals("boolean") ? Symbol.SymType.BOOLEAN : Symbol.SymType.VOID;
	}

	public enum SymType{
		INT, BOOLEAN, VOID
	}

	public enum SymStyle{
		METHOD, VARIABLE, ARRAY
	}
}