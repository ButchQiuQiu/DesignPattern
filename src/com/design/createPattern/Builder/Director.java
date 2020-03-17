package com.design.createPattern.Builder;
//指挥者/导演 指挥建造者
public class Director {
	private Builder builder=null;
	public Director(Builder b) {
		this.builder=b;
	}
	public Car BuilderCar() {
		builder.builderName();
		builder.builderPrice();
		builder.builderSpeed();
		return builder.getCar();
	}
}
