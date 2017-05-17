package com.learning.java.game.tictactoe;

public class Move {
	private int x;
	private int y;
	private char piece;

	public Move(int x, int y, char piece) {
		this.x = x;
		this.y = y;
		this.piece = piece;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getPiece() {
		return piece;
	}

	public void setPiece(char piece) {
		this.piece = piece;
	}

}
