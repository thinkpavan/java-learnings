package com.learning.sun.tutorials.io;

public class Root1 {
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);
		/*
		 * d - integer 
		 * f - decimal value 
		 * n - platform specific line terminator
		 */
		System.out.format("The square root of %d is %f.%n", i, r);
	}
}
