package com.learning.sun.tutorials.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try{
			reader = new BufferedReader(new FileReader(CopyLines.class.getClassLoader().getResource("source.txt").getPath()));
			writer = new PrintWriter("copyLines.txt");
			
			String line = null;
			while((line = reader.readLine() )!= null){
				writer.write(line);
			}
		}finally{
			if(reader != null )  reader.close();
			if(writer != null )  writer.close();
		}
	}
}
