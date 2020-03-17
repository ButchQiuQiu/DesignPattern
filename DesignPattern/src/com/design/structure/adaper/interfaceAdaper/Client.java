package com.design.structure.adaper.interfaceAdaper;

public class Client {
	//缺省接口适配器常见于框架的异步监听 抽象类重写所有时间方法为空方法 用户新建匿名类选择重写运行
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("琥珀的一天");
		//构造器使用
		Human amber=new Human() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				super.eat();
				System.out.println("吃饭饭");
			}
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				super.sleep();
				System.out.println("睡觉");
			}
			
		};
		//或者独立调用
		amber.OneDay();
	}

}
