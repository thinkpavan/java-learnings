package com.learning.journaldev.designpatterns.singleton;


public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		if( instance == null ){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
