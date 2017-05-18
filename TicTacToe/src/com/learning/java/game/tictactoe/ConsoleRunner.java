package com.learning.java.game.tictactoe;

import java.util.Scanner;

public class ConsoleRunner {
	private boolean playerX;
	private boolean challenger;

	public ConsoleRunner(boolean playerX, boolean challenger) {
		this.playerX = playerX;
		this.challenger = challenger;
	}

	public void mianLoop() {

		Game game = new Game(true, true);

		for (int i = 0; i < 9; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter x and y position");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
		}
	}
}
