package com.design.behavior.mediator;
//中介者模式 解耦类与类直接点关系 比如mvc的控制器 
//本例子用户控制家里的电器,两者之间会建立一个中介者类似米家app,mvc的控制器.
public class Client {
	public static void main(String[] args) {
		new Phone().openElectric(new TV());
		new Phone().RunElectric(new WaterHeater());
	}
}
