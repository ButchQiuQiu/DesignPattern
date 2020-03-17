package com.design.behavior.command;

public class SleepCommand implements Command {
	private Amber amber;
	public SleepCommand(Amber amber) {
		this.amber=amber;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		amber.sleep();
	}

}
