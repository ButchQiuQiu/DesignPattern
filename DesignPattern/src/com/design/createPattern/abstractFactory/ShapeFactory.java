package com.design.createPattern.abstractFactory;

public class ShapeFactory extends AbstractFactory{
	public  Shape getShape(String shapeType) {
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

	@Override
	public Color getColor(String ColorType) {
		// TODO Auto-generated method stub
		return null;
	}


}
