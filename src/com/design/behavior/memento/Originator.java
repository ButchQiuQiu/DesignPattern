package com.design.behavior.memento;
//发起人  需要储存的对象
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	//一个制造备忘录的工厂方法
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	//恢复指定备忘录的状态
	public void restroreMemento(Memento mo) {
		this.setState(mo.getState());
	}
}
