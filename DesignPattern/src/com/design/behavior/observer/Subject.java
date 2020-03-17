package com.design.behavior.observer;

public interface Subject {
	public void deleteObserver(Observer ob) ;
	public void addObserver(Observer ob);
	public void notifyObserver() ;
}
