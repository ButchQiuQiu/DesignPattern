package com.design.behavior.interpreter.scienceCaculator;
//终结符 变量 不可再推导
public class VarExpression implements Expression {
	private String myopVar;
	public VarExpression(String opVar) {
		this.myopVar=opVar;
	}
	@Override
	public double interpreter() {
		// TODO Auto-generated method stub
		return Double.parseDouble(myopVar);
	}

}
