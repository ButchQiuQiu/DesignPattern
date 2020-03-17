package com.design.behavior.memento;
//备忘录模式,记录对象的历史状态,可随时恢复.比如编辑器的ctrl+z;
//本例是白箱模式;
//黑箱实现:备忘录组合进发起者(如内部类等等);
//多重检查模式:现实中一般使用容器存储多个备忘录;
public class Client {
	public static void main(String[] args) {
		//创造发起人
		Originator o=new Originator();
		o.setState("111");
		//创造备忘录记录发起人的状态
		Memento m=o.createMemento();
		o.setState("222");//切换到别的状态
		//使用管理器caretaker保存备忘录
		CareTaker ct=new CareTaker();
		ct.setMemento(m);
		//发起人恢复状态
		o.restroreMemento(ct.getMemento());
		System.out.println(o.getState());
	}
}
