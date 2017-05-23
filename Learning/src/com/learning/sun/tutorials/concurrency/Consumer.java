package com.learning.sun.tutorials.concurrency;

public class Consumer implements Runnable {
	private boolean flag;
	private Counter c;

	public Consumer(Counter c) {
		this.c = c;
		flag = true;
	}

	@Override
	public void run() {
		try {
			consume();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void consume() throws InterruptedException {
		while (flag) {
			if (!c.isAvailable()) {
				synchronized (c) {
					c.wait();
				}

			}
			c.decrement();

			int data = c.getValue();
			System.out.println(" T2 " + data);
			if ( data == 20){
				flag = false;	
				}
			synchronized (c) {

				c.notifyAll();
			}
		}
	}
}
