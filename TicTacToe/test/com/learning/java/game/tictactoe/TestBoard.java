package com.learning.java.game.tictactoe;

import org.junit.Assert;
import org.junit.Test;


public class TestBoard {
	private char[][] horizontalSuccess = {{'X', 'X', 'X'}, 
										  {'O', 'O', 'O'},
										  {'X', 'X', 'O'}};
	
	private char[][] verticalSuccess = {{'X', 'O', 'X'}, 
										{'X', 'O', 'O'},
										{'X', 'X', 'O'}};

	private char[][] diagnoalSuccess = {{'O', 'O', 'X'}, 
										{'X', 'O', 'O'},
										{'X', 'X', 'O'}};

	private static char[][] failue = {{'O', 'O', 'X'}, 
									  {'X', 'X', 'O'}, 
									  {'O', 'X', 'O'}};

	@Test
	public void testHorizontalSuccess() {
		Board board = new Board(horizontalSuccess);
		boolean retValue = board.isFull();
		Assert.assertTrue(retValue);
	}
	@Test
	public void testVerticalSuccess() {
		Board board = new Board(verticalSuccess);
		boolean retValue = board.isFull();
		Assert.assertTrue(retValue);
	}
	@Test
	public void testDiagnoalSuccess() {
		Board board = new Board(diagnoalSuccess);
		boolean retValue = board.isFull();
		Assert.assertTrue(retValue);
	}
	@Test
	public void testFailure() {
		Board board = new Board(failue);
		boolean retValue = board.isFull();
		Assert.assertFalse(retValue);
	}
}
