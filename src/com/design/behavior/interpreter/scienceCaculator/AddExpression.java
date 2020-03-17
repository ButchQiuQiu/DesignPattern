package com.design.behavior.interpreter.scienceCaculator;

public class AddExpression extends SymbolExpression {
	public static String SYMBOL="+";
	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}
	@Override
	public double interpreter() {
		// TODO Auto-generated method stub
		return super.left.interpreter()+super.right.interpreter();
	}
	

}
