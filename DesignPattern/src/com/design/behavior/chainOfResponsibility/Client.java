package com.design.behavior.chainOfResponsibility;
//责任链模式，每个节点都有机会（权限或者条件匹配）处理请求事务。
public class Client {
	public static void main(String[] args) {
		ErrorLogger error=new ErrorLogger(AbstractLogger.ERROR);
		FileLogger file=new FileLogger(AbstractLogger.DEBUG);
		ConsoleLogger console=new ConsoleLogger(AbstractLogger.INFO);
		console.setNextLogger(file);
		file.setNextLogger(error);
		
		console.logMessage(AbstractLogger.ERROR,"这是一条ERROR信息");
		console.logMessage(AbstractLogger.DEBUG,"这是一条DEBUG信息");
		console.logMessage(AbstractLogger.INFO,"这是一条INFO信息");
	}
}
