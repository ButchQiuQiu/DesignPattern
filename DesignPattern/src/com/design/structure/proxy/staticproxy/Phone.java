package com.design.structure.proxy.staticproxy;

public class Phone implements Call{
	public void PlayGame() {
		
	}
	public void WatchBiliBili() {
		
	}
	@Override
	public boolean callByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		
		System.out.println("朝"+phoneNumber+"打电话");
		return true;
	}
}
