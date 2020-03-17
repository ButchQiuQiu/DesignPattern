package com.design.createPattern.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		switch (factory) {
		case "Shape":
			return new ShapeFactory();
		case "Color":
			return new ColorFactory();
		}
		
		return null;
	}
}
