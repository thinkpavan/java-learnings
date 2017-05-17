package com.learning.java.game.tictactoe;

public class Game {

	private boolean playerX;
	private boolean challenger;

	public Game(boolean playerX, boolean challenger) {
		this.playerX = playerX;
		this.challenger = challenger;
	}

	public Board getBoard() {
		Board retValue = null;

		return retValue;
	}

	public GameStatus getGameStatus() {
		GameStatus retValue = null;

		return retValue;
	}

	public void aiPlacePeace() {
		// AI turn
	}

	public void playerPlacePeace(int x, int y) {

	}
}
