package com.design.createPattern.factory.functionFactory;
	//工厂方法类 每种产品都对应一个工厂 (需要提前知道生产目标)
public class Climent {
	public static void main(String[] args) {
		new CoffeeFactory().getProduct().show();
		new NaichaFactory().getProduct().show();
	}
}
