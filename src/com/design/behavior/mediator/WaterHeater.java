package com.design.behavior.mediator;

public class WaterHeater implements Electric {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开了热水器");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("正在使用热水器");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭热水器");
	}

}
