package com.design.structure.facade;
//外观模式
//把一个复杂系统的外部简洁包装易于主系统的使用，避免其他人对子系统的更改
public class Client {
	public static void main(String[] args) {
		Amber am=new Amber();
		am.amAction();
		am.pmAction();
		am.nightAction();
	}
}
