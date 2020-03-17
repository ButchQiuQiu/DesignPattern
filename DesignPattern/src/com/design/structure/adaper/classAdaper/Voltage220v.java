package com.design.structure.adaper.classAdaper;

public class Voltage220v {
	public Voltage220v() {};
	private static class Instance{
		private static Voltage220v instance=new Voltage220v();
	}
	public static Voltage220v getInstance() {
		return Instance.instance;
	}
	public int outVoltage() {
		return 220;
	}
}
