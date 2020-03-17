package com.design.behavior.interpreter.caculator;

import java.util.HashMap;
//TerminalExpression 终结表达式 非符号变量
public class VarExpression extends Expression {
    
    private String key;
    
    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }

}
