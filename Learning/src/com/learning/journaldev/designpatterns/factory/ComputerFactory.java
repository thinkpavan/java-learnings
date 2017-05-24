package com.learning.journaldev.designpatterns.factory;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		Computer retValue = null;
		
		if( "PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		
		if( "Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return retValue;
	}
}