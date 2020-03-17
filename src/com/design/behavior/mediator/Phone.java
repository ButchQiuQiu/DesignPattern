package com.design.behavior.mediator;
//中介者,使用手机来控制电器
public class Phone {
	public void openElectric(Electric ec) {
		ec.open();
	}
	
	public void RunElectric(Electric ec) {
		ec.run();
	}
	
	public void CloseElectric(Electric ec) {
		ec.close();
	}
	
	
}
