package com.design.createPattern.Builder;

public class Car {
	private String name;
	private double price;
	private String speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", speed=" + speed + "]";
	}
}
