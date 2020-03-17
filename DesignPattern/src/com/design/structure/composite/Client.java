package com.design.structure.composite;
//组合模式,用于迭代储存同属性不同层级的对象（如公司职员，文件夹）
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School president=new School("琥珀","校长",30000);
		School teacher=new School("球球","老师",8000);
		School student=new School("布奇","学生",-20000);
		president.Add(teacher);
		teacher.Add(student);
		System.out.println(president);
	}

}
