package com.design.createPattern.Builder;
//建造者模式
//单产品多个建造者 导演可以控制顺序 建造者建造 产品提供框架属性
public class Client {
	public static void main(String[] args) {
		Director dr=new Director(new ConcreteBuilder_SmallCar());
		System.out.println(dr.BuilderCar());
	}
}
