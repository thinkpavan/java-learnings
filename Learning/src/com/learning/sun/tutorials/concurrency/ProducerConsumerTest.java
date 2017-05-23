package com.learning.sun.tutorials.concurrency;

public class ProducerConsumerTest {
	public static void main(String[] args) throws Exception{
		Counter c = new Counter();
		Thread producer = new Thread(new Producer(c));
		Thread consumer = new Thread(new Consumer(c));

		
		producer.start();
		consumer.start();
		
		Thread.currentThread().join();
		System.out.println("End of main");
	}
}
