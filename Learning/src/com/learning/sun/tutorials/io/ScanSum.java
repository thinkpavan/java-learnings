package com.learning.sun.tutorials.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {
	public static void main(String[] args) throws IOException{
		Scanner s = null;
		double sum = 0;
		try{
			s = new Scanner(new BufferedReader(new FileReader(ScanSum.class.getClassLoader().getResource("usnumbers.txt").getPath())));
			s.useLocale(Locale.US);
			
			while( s.hasNext()){
				if(s.hasNextDouble()){
					sum += s.nextDouble();
				}else{
					s.next();
				}
			}
		}finally{
			if( s != null )s.close();
		}
		
		System.out.println(sum);
	}
}
