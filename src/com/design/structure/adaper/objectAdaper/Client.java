package com.design.structure.adaper.objectAdaper;


//对象适配器模式 聚合适配对象
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adaper ad=new AdaperImpl(new Voltage220v());
		ad.adaperto5v();
	}

}
