package com.design.createPattern.Singleton;
//饿汉式 简单 线程安全 但没有懒加载
public class Hunger {
	private static Hunger instance=new Hunger();
	private Hunger() {
		
	}
	public static Hunger getInstance() {
		return instance;
	}
}
