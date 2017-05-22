package com.learning.sun.tutorials.concurrency;

public class ThreadConsistancy {
	
	static class MyThread implements Runnable{
		private int i;
		private Counter c;
		
		MyThread(int i, Counter c){
			this.i = i;
			this.c = c;
		}
		@Override
		public void run(){
			if( i%2 ==0 ){
				c.increment();
			}else{
				c.decrement();
			}
			System.out.println(c.getValue());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new MyThread(1,c));
		Thread t2 = new Thread(new ThreadConsistancy.MyThread(2,c));
		
		
		t1.start();
		t2.start();
		
	}
}
