package com.design.behavior.interpreter.scienceCaculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Client {
	// 解释器模式
	// 自己做的一个科学计算器
	public static void main(String[] args) throws IOException {
		while (true) {
			String infix = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			List<String> list=PostfixByInfix(infix);
			System.out.println(list);
			System.out.println(new Calculator(list).compute());
		}
	}

	/**
	 * 把中缀表达式转换为后缀表达式
	 * 
	 * @param infix
	 * @return
	 */
	private static List<String> PostfixByInfix(String infix) {
		Map<String, Integer> symbols = SymbolExpression.SYMBOL;
		// 数字栈存放数字
		Stack<String> stack1 = new Stack<String>();
		// 操作符栈存放操作符
		Stack<String> stack2 = new Stack<String>();
		// 从左往右扫描表达式 扫描到infix的长度为0为止
		while (infix.length() > 0) {
			String symbol = null;// 扫描下一步的类型
			int scanIndex = -2;// 最近的符号坐标值 0为下一种字符为符号,非0为下一种字符为数字,-2为初始化
			// 扫描一轮
			for (Map.Entry<String, Integer> entry : SymbolExpression.SYMBOL.entrySet()) {
				if (infix.indexOf(entry.getKey()) != -1) {
					if (scanIndex == -2) {
						scanIndex = infix.indexOf(entry.getKey());
						symbol = entry.getKey();
					} else if (infix.indexOf(entry.getKey()) < scanIndex) {
						scanIndex = infix.indexOf(entry.getKey());
						symbol = entry.getKey();
					}
				}
			}
			scanIndex = scanIndex < 0 ? 1 : scanIndex;// 没有扫描到符号就存值为1，代表下一个是数字
			if (scanIndex != 0) {
				// 遇到数字
				String strtemp = infix.substring(0, scanIndex);
				infix = infix.substring(scanIndex);
				stack2.push(strtemp);
			}  else {
				// 遇到运算符
				infix = infix.substring(symbol.length());
				if (stack1.size() == 0) {
					stack1.push(symbol);
				} else if (symbols.get(symbol) == -1) {
					// 遇到括号
					if ("(".equals(symbol)) {
						//左括号无脑入栈
						stack1.push(symbol);
					} else if (")".equals(symbol)) {
						//右括号重复抽取s1的栈顶直到遇到(括号
						while(true) {
							if("(".equals(stack1.peek())) {
								stack1.pop();
								break;
							}else {
								stack2.push(stack1.pop());
							}
						}
					}
				}else if (symbols.get(symbol) > symbols.get(stack1.peek())) {
					//当前符号比栈顶大
					stack1.push(symbol);
				} else if (symbols.get(symbol) <= symbols.get(stack1.peek())) {
					//当前比栈顶小
					Stack<String> stacktemp=new Stack<String>(); //放(括号的临时栈
					//如果当前的符号小于或者等于S2栈顶的符号则栈顶移入s1继续对比,其中遇到括号无视(先放入临时栈后面加回s2)
					while (symbols.get(symbol) <= symbols.get(stack1.peek())) {
						if("(".equals(stack1.peek())) {
							stacktemp.push(stack1.pop());
						}
						stack2.push(stack1.pop());
						if(stack1.size()==0) {
							break;
						}
					}
					//处理临时括号栈
					while (stacktemp.size() != 0) {
						stack1.push(stacktemp.pop());
					}
					//最后把符号送入s2
					stack1.push(symbol);
				}
			}
		}
		//拼接s1 s2成为后缀表达式
		while (stack1.size() != 0) {
			stack2.push(stack1.pop());
		}
		return stack2;
	}
}
