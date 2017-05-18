package com.learning.java.game.tictactoe;

import java.util.Scanner;

public class ConsoleRunner {
	private boolean playerX;
	private boolean challenger;
	private Scanner sc;

	public ConsoleRunner(boolean playerX, boolean challenger) {
		this.playerX = playerX;
		this.challenger = challenger;
	}

	public void mianLoop() {

		Game game = new Game(true, true);

		do{
			sc = new Scanner(System.in);
			System.out.println("Enter x and y position");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			game.playerPlacePeace(x, y);
	
			game.aiPlacePeace();
			
			System.out.println(game.getBoard()+"\n"+game.getGameStatus());
			
		}while( game.getGameStatus() == GameStatus.IN_PROGRESS );
		System.out.println(" Game status "+game.getGameStatus());
	}
}
