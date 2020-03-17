package com.design.behavior.nullObject;

public abstract class Cat {
	protected String name;
	protected double age;
	protected double height;
	protected String Character;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", height=" + height + ", Character=" + Character + "]";
	}
	
}
