package com.design.createPattern.Prototype;

public class Product  extends Prototype{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InnerObj obj;
	private String name;
	private int age;
	private double height;
	public Product() {
		obj=new InnerObj();
		obj.setName("我是一个内部对象");;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Product [obj=" + obj + ", name=" + name + ", age=" + age + ", height=" + height + ", hashCode()="
				+ hashCode() + "]";
	}
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Product p=(Product)super.clone();
		p.obj=(InnerObj)obj.clone();
		return p;
	}
	
	
	
}
class InnerObj extends Prototype{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "InnerObj [name=" + name + ", hashCode()=" + hashCode() + "]";
	}
	
}
