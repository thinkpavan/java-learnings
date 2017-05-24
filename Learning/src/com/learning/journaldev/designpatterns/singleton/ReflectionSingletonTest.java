package com.learning.journaldev.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) throws Exception{
		EarlyInitializedSingleton instanceOne = EarlyInitializedSingleton.getInstance();
		EarlyInitializedSingleton instanceTwo = null;
		
		Constructor<?>[] constructors = EarlyInitializedSingleton.class.getDeclaredConstructors();
		
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			
			instanceTwo = (EarlyInitializedSingleton) constructor.newInstance();
			break;
		}
		System.out.println(instanceOne);
		System.out.println(instanceTwo);
	}
}
