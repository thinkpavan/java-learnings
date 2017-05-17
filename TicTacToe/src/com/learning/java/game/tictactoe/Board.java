package com.learning.java.game.tictactoe;

public class Board {
	private static final int SIZE = 3;
	private char[][] board = null;

	public Board() {
		board = new char[SIZE][SIZE];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("********************");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				builder.append(board[i][j] + "\t");
			}
			builder.append("\n");
		}
		builder.append("********************");
		return builder.toString();
	}

	public char get(int i, int j) {
		if (i >= SIZE || j >= SIZE) {
			System.err.println("out of range index");
			return Character.MIN_VALUE;
		}
		return board[i][j];
	}

	public boolean isFull() {
		// check and return true;
		return true;
	}
}
