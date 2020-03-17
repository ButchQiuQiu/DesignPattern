package com.design.behavior.strategy;

import com.design.behavior.state.Excitde;
import com.design.behavior.state.State;
import com.design.behavior.state.Tired;

public class Amber {
	//所有的状态可以集成在Context里面,也可以在使用的时候实例化
	public static State TIRED=new Tired();
	public static State EXCITDE=new Excitde();
	private State state;
	public  Amber(State state) {
		this.state=state;
	};
	public void Miaow() {
		state.Miaow();
	}
}
