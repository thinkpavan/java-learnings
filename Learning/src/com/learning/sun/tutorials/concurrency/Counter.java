package com.learning.sun.tutorials.concurrency;

public class Counter {
	private int c = 0;
	private boolean available = false;
	
	public synchronized void increment(){
		c++;
		available = true;
	}
	public synchronized void decrement(){
		c++;
		available = false;
	}
	public synchronized int getValue(){
		return c;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
