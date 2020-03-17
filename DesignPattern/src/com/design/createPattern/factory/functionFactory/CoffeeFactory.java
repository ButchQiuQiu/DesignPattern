package com.design.createPattern.factory.functionFactory;

public class CoffeeFactory implements IFactory {

	@Override
	public IProduct getProduct() {
		// TODO Auto-generated method stub
		
		return new Coffee();
	}

}
