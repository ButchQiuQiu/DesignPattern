package com.design.behavior.observer;

import java.util.Vector;

public class Teacher implements Subject {
	private Vector<Observer> obs=new Vector<Observer>();;
	private String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public void deleteObserver(Observer ob) {
		// TODO Auto-generated method stub
		obs.remove(ob);
	}

	@Override
	
	public void addObserver(Observer ob) {
		// TODO Auto-generated method stub
		obs.add(ob);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob:obs) {
			ob.update(msg);
		}
	}

}
