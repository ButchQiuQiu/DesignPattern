package com.design.structure.decorator;

public class NingMengNaiCha extends Food {

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		this.setFoodPrice(12);
		this.setFoodName("柠檬奶茶");
	}

	public NingMengNaiCha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NingMengNaiCha(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}
	

}
