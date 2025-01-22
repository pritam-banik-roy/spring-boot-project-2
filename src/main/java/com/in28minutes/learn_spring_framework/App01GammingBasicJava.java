package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

public class App01GammingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame(); //1: object creation
		
		var gameRunner = new GameRunner(game); 
		//2: object creation + wiring of dependencies
		// Game is a dependency of GameRunner
		
		
		gameRunner.run();
		//pritam
		
	}

}
