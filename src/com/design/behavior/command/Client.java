package com.design.behavior.command;
//命令模式，把对象的函数抽象成一个总接口和各自函数的实现类，用户可以自定义命令的执行和顺序。
public class Client {
	public static void main(String[] args) {
		//实例化命名来源对象
		Amber amber=new Amber();
		//实例化每一个来自命令来源对象的方法
		EatCommand ec=new EatCommand(amber);
		PlayCommand pc=new PlayCommand(amber);
		SleepCommand sc=new SleepCommand(amber);
		//实例化调用器
		Invoker invoker=new Invoker();
		//往调用器里面添加命令 
		invoker.addCommand(sc);
		invoker.addCommand(pc);
		invoker.addCommand(ec);
		invoker.addCommand(sc);
		invoker.addCommand(pc);
		invoker.addCommand(ec);
		invoker.addCommand(sc);
		invoker.addCommand(pc);
		invoker.addCommand(ec);
		//执行所有添加后的命令
		invoker.executeAllCommand();
	}
}
