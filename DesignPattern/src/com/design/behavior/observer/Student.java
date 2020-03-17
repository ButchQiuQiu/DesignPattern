package com.design.behavior.observer;

public class Student implements Observer {
	private String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+"正在听老师讲"+msg);
	}

}
