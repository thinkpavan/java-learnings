package com.learning.journaldev.designpatterns.singleton;

public class ThreadSafeDoubleLocking {
	private static ThreadSafeDoubleLocking instance;
	
	private ThreadSafeDoubleLocking(){}
	
	public static ThreadSafeDoubleLocking getInstance(){
		synchronized (ThreadSafeDoubleLocking.class) {
			if( instance == null ){
				instance = new ThreadSafeDoubleLocking();
			}
		}
		
		return instance;
	}
}
