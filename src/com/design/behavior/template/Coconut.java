package com.design.behavior.template;

public class Coconut extends HaveADrinks {

	@Override
	protected final void openTheBottle() {
		// TODO Auto-generated method stub
		System.out.println("拿刀劈开椰子");
	}

	@Override
	protected final void DrinkTheDrinks() {
		// TODO Auto-generated method stub
		System.out.println("喝掉椰子汁,吃掉椰子肉");
	}

	@Override
	protected final void CloseTheBottle() {
		// TODO Auto-generated method stub
		System.out.println("把椰子丢进垃圾桶");
	}

}
