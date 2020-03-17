package com.design.behavior.mediator;

public class TV implements Electric {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开了电视");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("播放电视");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭了电视");
	}

}
