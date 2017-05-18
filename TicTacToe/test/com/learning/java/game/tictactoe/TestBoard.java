package com.learning.java.game.tictactoe;

import org.junit.Assert;
import org.junit.Test;


public class TestBoard {
	private char[][] horizontalSuccess = {{'X', 'O', 'X'}, 
										  {'O', 'X', 'O'},
										  {'X', 'X', 'X'}};
	
	private char[][] verticalSuccess = {{'X', 'O', 'X'}, 
										{'O', 'O', 'X'},
										{'O', 'X', 'X'}};

	private char[][] diagnoalSuccess = {{'O', 'O', 'X'}, 
										{'X', 'O', 'O'},
										{'X', 'X', 'O'}};

	private static char[][] failue = {{'O', 'O', 'X'}, 
									  {'X', 'X', 'O'}, 
									  {'O', 'X', 'O'}};


	@Test
	public void testHorizontalSuccess() {
		Board board = new Board(horizontalSuccess);
		GameStatus retValue = board.checkHorizontal();
		Assert.assertEquals(GameStatus.X_WON, retValue);
	}

	@Test
	public void testVerticalSuccess() {
		Board board = new Board(verticalSuccess);
		GameStatus retValue = board.checkVertical();
		Assert.assertEquals(GameStatus.X_WON, retValue);
	}

	@Test
	public void testDiagnoalSuccess() {
		Board board = new Board(diagnoalSuccess);
		GameStatus retValue = board.checkDiagnoal();
		Assert.assertEquals(GameStatus.O_WON, retValue);
	}

	@Test
	public void testFailure() {
		Board board = new Board(failue);
		boolean retValue = board.isFull();
		Assert.assertTrue(retValue);
	}
}
