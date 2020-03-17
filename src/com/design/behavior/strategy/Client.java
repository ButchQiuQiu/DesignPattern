package com.design.behavior.strategy;
//策略模式,和状态模式结构一样.但状态模式是在允许过程中改变状态,而策略模式是创建的时候确定状态.
public class Client {
	public static void main(String[] args) {
		//兴奋的叫
		new Amber(Amber.EXCITDE).Miaow();
		//困困的叫
		new Amber(Amber.TIRED).Miaow();
	}
}
