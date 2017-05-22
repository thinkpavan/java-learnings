package com.learning.sun.tutorials.concurrency;

public class HelloThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Hello from thread");
	}
	
	public static void main(String[] args) {
		HelloThread t = new HelloThread();
		t.start();
	}
}
