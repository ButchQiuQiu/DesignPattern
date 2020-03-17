package com.design.structure.adaper.classAdaper;

//类适配器模式 继承重写适配父类
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adaper ad=new AdaperImpl();
		ad.adaperto5v();
	}

}
