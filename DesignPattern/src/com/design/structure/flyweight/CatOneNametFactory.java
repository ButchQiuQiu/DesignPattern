package com.design.structure.flyweight;

import java.util.HashMap;

public class CatOneNametFactory {
	private static final HashMap<String,Cat> CARS=new HashMap<String,Cat>();
	public static void AddCat(Cat cat) {
		if(CARS.containsKey(cat.getName())==false) {
			System.out.println("数据没有"+cat+"已添加");
			CARS.put(cat.getName(), cat);
		}else {
			System.out.println("数据已有"+cat+"不添加");
		}
	}
	public static Cat getCatByName(String name) {
		return CatOneNametFactory.CARS.get(name);
	}
	public static HashMap<String,Cat> getAllCat(){
		return CatOneNametFactory.CARS;
	}
}
