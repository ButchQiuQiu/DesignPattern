package com.design.structure.decorator;

public class YuanWeiNaiCha extends Food{
	protected void init() {
		this.setFoodName("原味奶茶");
		this.setFoodPrice(10);
	}
	public YuanWeiNaiCha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public YuanWeiNaiCha(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}
	
}
