package com.design.behavior.nullObject;
//空对象模式,用户使用自定义工厂创造对象,如果创造的对象不在允许的范围里,就会弹出空对象,此空对象是逻辑意义上的空对象.
public class Clint {
	public static void main(String[] args) {
		CatFactory cf=new CatFactory();
		System.out.println(cf.getCat("狸花猫"));
		System.out.println(cf.getCat("橘猫"));
		System.out.println(cf.getCat("黑猫"));
	}
}
