package com.design.behavior.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level) {
		this.level=level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Console:"+message);
	}

}
