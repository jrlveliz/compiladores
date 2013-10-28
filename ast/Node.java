package compiler.ast;

import compiler.lib.*;
 
public abstract class Node{
	public abstract void print(String padding);
	public abstract boolean check(Node parent);
} 