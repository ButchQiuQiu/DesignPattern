package com.design.structure.proxy.staticproxy;

public class HeadSetPhone implements Call {
	private Phone phone;
	private boolean remotecontrolHaved;
	public HeadSetPhone (boolean remotecontrolHaved) {
		this.phone=new Phone();
		this.remotecontrolHaved=remotecontrolHaved;
	}
	@Override
	public boolean callByPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		if(this.remotecontrolHaved) {
			System.out.println("这个耳机没有线控不能语音控制拨号 正在手动拨号");
			phone.callByPhoneNumber(phoneNumber);
		}else {
			System.out.println("这个耳机有线控 正在使用语音助手拨号");
			phone.callByPhoneNumber(phoneNumber);
		}
		return true;
	}
}
