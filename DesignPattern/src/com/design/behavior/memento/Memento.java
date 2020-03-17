package com.design.behavior.memento;
//备忘录 存储发起人的属性
public class Memento {
	private String state;
	public Memento(String state) {
		this.state=state;
	}	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
