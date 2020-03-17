package com.design.createPattern.abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		switch(colorType) {
		case "Red":
			return new Red();
		case "Blue":
			return new Blue();
		}
		return null;
	}

}
