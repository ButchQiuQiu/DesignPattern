package com.design.structure.filter;

public class Person {
	private String name;
	private String sex;
	private String address;
	private int age;
	
	public Person(String name, String sex, String address, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", address=" + address + ", age=" + age + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
