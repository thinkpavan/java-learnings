package com.learning.sun.tutorials.concurrency;

public class Counter {
	private int c = 0;

	public synchronized void increment(){
		c++;
	}
	public synchronized void decrement(){
		c--;
	}
	public synchronized int getValue(){
		return c;
	}
}
