package com.learning.java.game.tictactoe;

public class Game {

	private boolean playerX;
	private boolean challenger;
	private Board board;
	private AI ai;
	public Game(boolean playerX, boolean challenger) {
		this.playerX = playerX;
		this.challenger = challenger;
		board = new Board();
		ai = new DumbAI();
	}

	public Board getBoard() {

		return board;
	}

	public GameStatus getGameStatus() {
		GameStatus retValue = GameStatus.IN_PROGRESS;

		if (board.isFull()) {
			return GameStatus.DRAW;
		} else {

			GameStatus verticalStatus = board.checkVertical();
			if (verticalStatus == GameStatus.X_WON || verticalStatus == GameStatus.O_WON)
				return verticalStatus;

			GameStatus horizontalStatus = board.checkHorizontal();
			if (horizontalStatus == GameStatus.X_WON || horizontalStatus == GameStatus.O_WON)
				return horizontalStatus;

			GameStatus diagnoalStatus = board.checkDiagnoal();
			if (diagnoalStatus == GameStatus.X_WON || diagnoalStatus == GameStatus.O_WON)
				return diagnoalStatus;
		}
		return retValue;
	}

	public void aiPlacePeace() {
		Move move = ai.chooseMove(board);
		board.move(move.getX(), move.getY(), 'O');
	}

	public void playerPlacePeace(int x, int y) {
		board.move(x, y, 'X');
	}
}
