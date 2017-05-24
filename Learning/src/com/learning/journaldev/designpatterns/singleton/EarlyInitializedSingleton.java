package com.learning.journaldev.designpatterns.singleton;

public class EarlyInitializedSingleton {
	private static EarlyInitializedSingleton instance = new EarlyInitializedSingleton();
	
	public static EarlyInitializedSingleton getInstance(){
		return instance;
	}
}
