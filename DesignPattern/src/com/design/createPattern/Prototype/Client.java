package com.design.createPattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//浅度原型克隆 简单 但是不复制内部类			   (只用基类实现接口重写clone即可)
//深度原型克隆 复杂 克隆内部类 需要自己重写克隆方法(只要这个类有内部类就得重写clone)
//序列化克隆 简单 克隆内部类 但是比深度克隆慢了100倍...
//可以在基础上增加工厂管理登记
public class Client {
	public static void main(String[] args) throws  Exception {
		Product p=new Product();
		p.setAge(12);
		p.setHeight(173.3);
		p.setName("球球");
		System.out.println(p);
		System.out.println(p.clone());
		//序列化克隆
		//创建输入流
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(p);
		//创建输出流
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bais);
		//输出序列化结果
		System.out.println(ois.readObject());
		oos.close();
		baos.close();
		ois.close();
		bais.close();
	}
	
}
