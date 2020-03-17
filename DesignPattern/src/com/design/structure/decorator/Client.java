package com.design.structure.decorator;

public class Client {
	//装饰者模式(传统方案还有一个只有无参构造器的被装饰者) 弹性动态扩展
	public static void main(String[] args) {
		//点一倍原味奶茶
		Food food=new YuanWeiNaiCha();
		//加巧克力
		food=new Chocolate(food);
		//再点一倍柠檬奶茶
		food=new NingMengNaiCha(food);
		//加一份巧克力
		food=new Chocolate(food);
		food.cost();
	}
}
