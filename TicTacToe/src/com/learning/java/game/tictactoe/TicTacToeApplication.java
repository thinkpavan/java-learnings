package com.learning.java.game.tictactoe;

public class TicTacToeApplication {
	public static void main(String[] args) {
		boolean playerX = true;
		boolean challenger = false;
		ConsoleRunner runner = new ConsoleRunner(playerX, challenger);
		runner.mianLoop();
	}
}
