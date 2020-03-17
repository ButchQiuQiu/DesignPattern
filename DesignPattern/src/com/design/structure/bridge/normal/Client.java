package com.design.structure.bridge.normal;
//桥接模式：一个大种类聚合另一个大种类叫做桥接模式，在最原始的基类中聚合，缺点：耦合性高、优点：便于管理减少代码量。
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPen pen=new FeatherPen();
		Color color=new Red();
		pen.draw(color);
		pen=new Pencil();
		color=new White();
		pen.draw(color);
	}

}
