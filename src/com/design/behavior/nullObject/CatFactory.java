package com.design.behavior.nullObject;

public class CatFactory {
	public static String[] Cats= {"橘猫","狸花猫"};
	public Cat getCat(String catName){
		for(String name:Cats) {
			if(name.equals(catName)) {
				return new Meber();
			}
		}
		return new NotCat();
	}
}
