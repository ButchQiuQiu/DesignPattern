package com.design.createPattern.Builder;

public class ConcreteBuilder_SmallCar implements Builder {
	private Car car=new Car();
	@Override
	public void builderSpeed() {
		// TODO Auto-generated method stub
		car.setSpeed("340km/h");
	}

	@Override
	public void builderPrice() {
		// TODO Auto-generated method stub
		car.setPrice(120);
	}

	@Override
	public void builderName() {
		// TODO Auto-generated method stub
		car.setName("小车");
	}
	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return car;
	}

}
