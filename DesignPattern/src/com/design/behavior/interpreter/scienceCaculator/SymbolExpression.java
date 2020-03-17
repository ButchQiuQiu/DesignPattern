package com.design.behavior.interpreter.scienceCaculator;

import java.util.HashMap;
//NonterminalExpression 非终结表达式 一般是符号变量
public abstract  class SymbolExpression implements Expression{
	public static HashMap<String,Integer> SYMBOL=new HashMap<String,Integer>();
	static {
		SYMBOL.put("+", 0);
		SYMBOL.put("-", 0);
		SYMBOL.put("*", 1);
		SYMBOL.put("/",1);
		SYMBOL.put("(", -1);
		SYMBOL.put(")", -1);
	}
		
	protected Expression left;
	protected Expression right;
	public SymbolExpression(Expression left,Expression right) {
		this.left=left;
		this.right=right;
	}
}
