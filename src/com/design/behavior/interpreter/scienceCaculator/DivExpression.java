package com.design.behavior.interpreter.scienceCaculator;

public class DivExpression extends SymbolExpression {

	public DivExpression(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double interpreter() {
		// TODO Auto-generated method stub
		return super.left.interpreter()/super.right.interpreter();
	}

}
