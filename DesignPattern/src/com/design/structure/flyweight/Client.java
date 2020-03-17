package com.design.structure.flyweight;
//享元模式 共享一个对象 ，可以在多个场景使用，比如DB连接池，一般使用工厂制造。这样保证性能最好
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat amber=new Cat("琥珀", 0, 0);
		Cat amber1=new Cat("琥珀", 1, 1);
		Cat qiuqiu=new Cat("球球", 0, 0);
		Cat qiuqiu1=new Cat("球球", 100, 0);
		Cat qiuqiu2=new Cat("球球2", 1, 1);
		CatOneNametFactory.AddCat(amber);
		CatOneNametFactory.AddCat(amber1);
		CatOneNametFactory.AddCat(qiuqiu);
		CatOneNametFactory.AddCat(qiuqiu1);
		CatOneNametFactory.AddCat(qiuqiu2);
		System.out.println(CatOneNametFactory.getAllCat());
	}
}
