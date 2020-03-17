package com.design.structure.adaper.interfaceAdaper;

public abstract class Human implements Adaper{
	public Human() {
		this.eat();
		this.run();
		this.sleep();
		this.drink();
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
	
	public void OneDay() {
		this.eat();
		this.run();
		this.sleep();
		this.drink();
	}
}
