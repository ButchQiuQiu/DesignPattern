package com.design.structure.facade;

public class Amber {
	private String name;
	private Action am;
	private Action pm;
	private Action night;
	public Amber() {
		super();
		this.name="琥珀";
		this.am=new amActionImpl();
		this.pm=new pmActionImpl();
		this.night=new nightActionImpl();
		
	}
	public void amAction() {
		System.out.println(this.am.action(this.name));
	}
	public void pmAction() {
		System.out.println(this.pm.action(this.name));
	}
	public void nightAction() {
		System.out.println(this.night.action(this.name));
	}
}
