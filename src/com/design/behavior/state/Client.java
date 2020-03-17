package com.design.behavior.state;
//状态模式,如果一个对象具有多个状态的话,可以把海量复杂的判断执行语句单独提取成一个独立的行为状态.
public class Client {
	public static void main(String[] args) {
		Amber meber=new Amber();
		//兴奋的叫
		meber.Maiow(Amber.EXCITDE);
		//困困的叫
		meber.Maiow(Amber.TIRED);
	}
}
