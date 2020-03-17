package com.design.structure.decorator;

public abstract  class Food {
	private String foodName;
	private double foodPrice;
	protected abstract void init();
	public Food() {
		init();
	}
	
	public Food(Food food) {
		this();
		this.foodPrice+=food.getFoodPrice();
		this.foodName+="、"+food.getFoodName();
	}
	public void cost() {
		System.out.println("点餐："+this.getFoodName()+"----总价格："+this.getFoodPrice());
	}
	protected String getFoodName() {
		return foodName;
	}
	protected void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	protected double getFoodPrice() {
		return foodPrice;
	}
	protected void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	
}
