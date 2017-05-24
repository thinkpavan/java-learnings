package com.learning.journaldev.designpatterns.singleton;

public class LazyInitailizedSingleton {
	private static LazyInitailizedSingleton instance;
	
	private LazyInitailizedSingleton(){}
	
	public static LazyInitailizedSingleton getInstance(){
		if( instance == null ){
			instance = new LazyInitailizedSingleton();
		}
		return instance;
	}
}
