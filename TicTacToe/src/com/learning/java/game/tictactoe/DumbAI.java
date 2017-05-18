package com.learning.java.game.tictactoe;

public class DumbAI implements AI {

	@Override
	public Move chooseMove(Board board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if( board.get(i, j) == '-'){
					return new Move(i, j, '-');
				}
			}
		}
		return null;
	}

}
