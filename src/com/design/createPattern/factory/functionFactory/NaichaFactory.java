package com.design.createPattern.factory.functionFactory;

public class NaichaFactory implements IFactory{

	@Override
	public IProduct getProduct() {
		// TODO Auto-generated method stub
		return new Naicha();
	}

}
