package com.design.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> commands;
	public Invoker() {
		commands=new ArrayList<Command>();
	}
	public void addCommand(Command command) {
		commands.add(command);
	}
	public void executeAllCommand() {
		for(int i=0;i<commands.size();i++) {
			commands.get(i).execute();
		}
	}
}
