package com.design.createPattern.Singleton;
// 懒汉式 复杂 线程安全 有懒加载
public class Dcl {
	private volatile static Dcl instance=null;
	public static Dcl getInstance() {
		if(instance==null) {
			synchronized (Dcl.class) {
				if(instance==null) {
					instance=new Dcl();
				}
			}
		}
		return Dcl.instance;
	}
}
