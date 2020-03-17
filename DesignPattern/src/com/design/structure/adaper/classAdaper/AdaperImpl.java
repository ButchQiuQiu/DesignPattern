package com.design.structure.adaper.classAdaper;

public class AdaperImpl extends Voltage220v implements Adaper {

	@Override
	public void adaperto5v() {
		System.out.println("输入电压为"+super.outVoltage()+"v");
		System.out.println("转换后输出电压为5v");
	}

}
