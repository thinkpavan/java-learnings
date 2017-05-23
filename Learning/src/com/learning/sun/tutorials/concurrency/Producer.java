package com.learning.sun.tutorials.concurrency;

public class Producer implements Runnable {
	private boolean flag;
	private Counter c;

	public Producer(Counter c) {
		this.c = c;
		flag = true;
	}

	@Override
	public void run() {
		System.out.println("Production started");
		try {
			produce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void produce() throws InterruptedException{
		while (flag) {
			if (c.isAvailable()) {
				synchronized (c) {
					c.wait();
				}
			}

			c.increment();

			int data = c.getValue();
			System.out.println(" T1 " + data);
			if ( data == 20){
			flag = false;	
			}
			synchronized (c) {

				c.notifyAll();
			}

		}
	}
}
