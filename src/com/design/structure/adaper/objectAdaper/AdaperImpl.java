package com.design.structure.adaper.objectAdaper;

public class AdaperImpl  implements Adaper {
	private  Voltage220v vg=null;
	public AdaperImpl(Voltage220v vgTemp) {
		// TODO Auto-generated constructor stub
		this.vg=vgTemp;
	}
	@Override
	public void adaperto5v() {
		System.out.println("输入电压为"+this.vg.outVoltage()+"v");
		System.out.println("转换后输出电压为5v");
	}

}
