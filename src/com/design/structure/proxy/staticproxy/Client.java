package com.design.structure.proxy.staticproxy;
//代理模式 创建一个中间层 在不更改原来的代码上增加扩展功能
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call call=new HeadSetPhone(true);
		call.callByPhoneNumber("110");
		call=new HeadSetPhone(false);
		call.callByPhoneNumber("110");
	}

}
