package com.design.behavior.command;

public class PlayCommand  implements Command{
	private Amber amber;
	public PlayCommand(Amber amber) {
		this.amber=amber;
	}
	public void execute() {
		amber.play();
	}
}
