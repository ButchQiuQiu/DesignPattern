package com.design.behavior.command;

public class EatCommand implements Command {
	private Amber amber;
	public EatCommand(Amber amber) {
		this.amber=amber;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		amber.eat();
	}

}
