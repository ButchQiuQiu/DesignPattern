package com.design.behavior.template;

public class Cola extends HaveADrinks {

	@Override
	protected final void openTheBottle() {
		// TODO Auto-generated method stub
		System.out.println("扭开可乐瓶");
	}

	@Override
	protected final void DrinkTheDrinks() {
		// TODO Auto-generated method stub
		System.out.println("喝可乐");
	}

	@Override
	protected final void CloseTheBottle() {
		// TODO Auto-generated method stub
		System.out.println("关闭可乐瓶丢进垃圾桶");
	}

}
