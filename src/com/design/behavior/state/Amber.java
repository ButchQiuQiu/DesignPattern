package com.design.behavior.state;

public class Amber {
	//所有的状态可以集成在Context里面,也可以在使用的时候实例化
	public static State TIRED=new Tired();
	public static State EXCITDE=new Excitde();
	//猫叫
	public void Maiow(State state) {
		state.Miaow();
	}
}
