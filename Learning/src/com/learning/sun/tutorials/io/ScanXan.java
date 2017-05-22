package com.learning.sun.tutorials.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader(ScanXan.class
					.getClassLoader().getResource("source.txt").getPath())));
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) s.close();
		}
	}
}