package com.design.createPattern.Singleton;
//静态内部类 懒加载 实现难度一般 线程安全
public class InnerClass {
	private static class singleton{
		private static InnerClass INSTANCE=new InnerClass();
	}
	public static InnerClass getInstance() {
		return singleton.INSTANCE;
	}
}
