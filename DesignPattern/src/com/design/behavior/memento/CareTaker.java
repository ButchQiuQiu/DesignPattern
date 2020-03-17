package com.design.behavior.memento;
//负责管理备忘录的类
public class CareTaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
