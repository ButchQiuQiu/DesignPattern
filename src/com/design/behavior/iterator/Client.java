package com.design.behavior.iterator;
//迭代器模式 给用户包装数据的迭代 ,避免用户直接接触到数据,保证安全性,易用性.
//一般都是使用内部类模式,本例子使用的是扩展性的继承模式
public class Client {
	public static void main (String [] args) {
		for(NaichaImpl nci=new NaichaImpl();nci.hasNext();) {
			System.out.println(nci.next());
		}
	}
}