package com.design.createPattern.factory.simpleFactory;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		switch (shapeType) {
		case "Round":
			return new Round();
		case "Circle":
			return new Circle();
		case "Square":
		return new Square();
		}
		return null;
	}
}
