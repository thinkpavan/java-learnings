package com.learning.sun.tutorials.concurrency;

public class SimpleThreads {
	static void threadMessage(String message){
		System.out.format("%s: %s.%n", Thread.currentThread().getName(),message);
	}
	
	private static class MessageLoop implements Runnable{
		@Override
		public void run() {
			String importantInfo[] = {
					"Mares eat oats",
					"Does eat oats",
					"Little lambs eat ivy",
					"A kid will eat ivy too"
			};

			try{
				for (String string : importantInfo) {
					Thread.sleep(4000);
					threadMessage(string);
				}
			}catch (InterruptedException e){
				threadMessage("I am done....");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Starging MessageLoop thread");
		long startTime = System.currentTimeMillis();
		long patience = 1000;
		
		while(t.isAlive()){
			threadMessage("Still waiting....");
		
			t.join(1000);
			
			if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
				threadMessage("Tired of waiting!");
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally....");
	}
}
