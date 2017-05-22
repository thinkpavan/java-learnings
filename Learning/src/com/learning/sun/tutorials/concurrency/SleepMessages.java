package com.learning.sun.tutorials.concurrency;

public class SleepMessages {
	public static void main(String[] args) throws InterruptedException {
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
		
		for (String string : importantInfo) {
			// pause for 4 sec
			Thread.sleep(4000);
			System.out.println(string);
		}
	}
}
