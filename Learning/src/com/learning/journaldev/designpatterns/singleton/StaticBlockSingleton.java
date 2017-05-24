package com.learning.journaldev.designpatterns.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	static{
		try{
			instance = new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException(" unable to create single ton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
