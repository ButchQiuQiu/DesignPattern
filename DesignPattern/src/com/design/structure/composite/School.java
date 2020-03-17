package com.design.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private String dept;
	private double salary;
	private List<School> schoolMan;
	
	public School(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.schoolMan=new ArrayList<School>();
	}
	public boolean Remove(School sl) {
		return schoolMan.remove(sl);
	}
	public boolean Add(School sl) {
		return schoolMan.add(sl);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<School> getSchoolMan() {
		return schoolMan;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", dept=" + dept + ", salary=" + salary + ", schoolMan=" + schoolMan + "]";
	}
	
	
}
