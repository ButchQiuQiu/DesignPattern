package com.design.behavior.interpreter.caculator;

import java.util.HashMap;

public abstract class Expression {
	//解析公式和数值，key是公式中的参数，value是具体的数值
	public abstract int interpreter(HashMap<String, Integer> var);
}
