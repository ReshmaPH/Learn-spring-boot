package com.sample.spring.project.Learnspringframework.game;

public class GameRunner {
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
