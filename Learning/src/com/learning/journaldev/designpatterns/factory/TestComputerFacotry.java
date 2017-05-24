package com.learning.journaldev.designpatterns.factory;

public class TestComputerFacotry {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "2 GB", "1 TB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("SERVER", "16 GB", "1 TB", "2.9 GHz");
		
		System.out.println("Facotry PC Config :: "+pc);
		System.out.println("Facotry Server Config :: "+server);
	}
}
