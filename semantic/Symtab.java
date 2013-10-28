package compiler.semantic;

import java.util.*;

public class Symtab{
	private Hashtable<String, Symbol> htSym;

	public Symtab(){
		htSym = new Hashtable<String, Symbol>();
	}

	public boolean addVariable(String idScope, Symbol.SymType tType, String sID){
		boolean valid = true;

		if(htSym.contains(idScope + "," + sID)){
			System.out.println("Error! La variable " + sID + " ya esta definida en el contexto " + idScope + ".");
			valid = false;
		}else{
			htSym.put(idScope + "," + sID, new Symbol(idScope, tType, sID));
		}

		return valid;
	}

	public boolean addMethod(Symbol mtd){
		boolean valid = true;
		String sMethodKey = "GLOBAL," + mtd.ID;
		String sParTypes = "";

		for (Symbol param : mtd.parameters) {
			sMethodKey += "," + param.type.name();
			sParTypes += param.type.name() + ", ";
		}

		if(sParTypes.endsWith(", "))
			sParTypes = sParTypes.substring(0, sParTypes.length() - 2);

		if(htSym.containsKey(sMethodKey)){
			System.out.println("Error! El metodo " + mtd.ID + "(" + sParTypes + ") ya esta declarado.");
			valid = false;
		}else{

			htSym.put(sMethodKey, mtd);
		}

		return valid;
	}
}