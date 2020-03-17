package com.design.behavior.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger{
	public ErrorLogger(int level) {
		this.level=level;
	}
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error:"+message);
	}

}
