package com.design.createPattern.factory.simpleFactory;

//简单工厂模式
public class Client {
	public static void main(String[] args) {
		ShapeFactory.getShape("Square").Draw();
	}
}
