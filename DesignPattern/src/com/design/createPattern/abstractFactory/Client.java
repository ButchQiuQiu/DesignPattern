package com.design.createPattern.abstractFactory;
//抽象工厂

//工厂生成器生成工厂
//工厂生成产品
public class Client {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		new FactoryProducer().getFactory("Color").getColor("Red").Splash();
		new FactoryProducer().getFactory("Shape").getShape("Circle").Draw();
	}
}
