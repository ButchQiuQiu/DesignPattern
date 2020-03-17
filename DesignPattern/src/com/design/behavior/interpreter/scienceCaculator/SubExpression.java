package com.design.behavior.interpreter.scienceCaculator;


public class SubExpression extends SymbolExpression{
	public static String SYMBOL="+";
	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public double interpreter() {
		// TODO Auto-generated method stub
		return super.left.interpreter()-super.right.interpreter();
	}
}
