package com.design.behavior.observer;
//观察者模式,一对多的依赖关系时可以使用.
//
public class Client {

	public static void main(String[] args) {
		//创建老师,老师为被观察者.
		Teacher tc=new Teacher();
		//创建学生,学生为观察者.
		Student Meber=new Student("琥珀");
		Student QiuQiu=new Student("球球");
		Student Butch=new Student("布奇");
		//添加观察者
		tc.addObserver(Butch);
		tc.addObserver(QiuQiu);
		tc.addObserver(Meber);
		//更新数据并且通知所有观察者
		tc.setMsg("鬼故事");
		tc.notifyObserver();
		//删除掉一个观察者然后继续更新
		tc.deleteObserver(Meber);
		System.out.println("琥珀吓晕了");
		tc.setMsg("英语作文");
		tc.notifyObserver();
	}

}
