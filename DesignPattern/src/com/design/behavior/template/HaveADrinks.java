package com.design.behavior.template;
//喝饮料的抽象类,详细且通用的步骤,抽象需要子类实现的详细方法.
public abstract class HaveADrinks {
	public void Drink() {
		this.openTheBottle();
		this.DrinkTheDrinks();
		this.CloseTheBottle();
	}
	protected abstract void openTheBottle();
	
	protected abstract void DrinkTheDrinks();
	
	protected abstract void CloseTheBottle();
}
