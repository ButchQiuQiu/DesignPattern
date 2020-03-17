package com.design.behavior.interpreter.scienceCaculator;

import java.util.List;
import java.util.Map;
import java.util.Stack;

//计算类 聚合引导所有Expression
public class Calculator {
	private Expression expression;
	public Calculator(List<String> infix) {
		//存储运算表达式
		Stack<Expression> stack=new Stack<Expression>();
		//从左到右计算
		while(infix.size()>0) {
			Expression left=null;
			Expression right=null;
			boolean isSymbol=false;
			//判断是否为符号
			for (Map.Entry<String, Integer> entry : SymbolExpression.SYMBOL.entrySet()) {
				if(entry.getKey()==infix.get(0)){
					isSymbol=true;
				}
			}
			if(isSymbol) {
				//符号出栈迭代处理
				right=stack.pop();
				left=stack.pop();
				switch (infix.get(0)) {
				case "+":
					stack.push(new AddExpression(left, right));
					break;
				case "-":
					stack.push(new SubExpression(left, right));
					break;
				case "*":
					stack.push(new MultExpression(left, right));
					break;
				case "/":
					stack.push(new DivExpression(left, right));
					break;
				}
			}else {
				//数字入栈
				stack.push(new VarExpression(infix.get(0)));
			}
			//计算一轮后删除第一个
			infix.remove(0);
		}
		//取出最后一个expression
		this.expression=stack.pop();
	}
	
	public double compute() {
		return this.expression.interpreter();
	}
}
