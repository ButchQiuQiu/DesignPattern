package com.design.structure.decorator;

public class Chocolate extends Food {
	 protected void init() {
		this.setFoodPrice(5);
		this.setFoodName("巧克力");
	 }
	public Chocolate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chocolate(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}
	
}
