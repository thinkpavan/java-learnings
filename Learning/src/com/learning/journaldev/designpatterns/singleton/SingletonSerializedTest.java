package com.learning.journaldev.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	public static void main(String[] args) throws Exception{
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton)in.readObject();
		in.close();
		System.out.println(instanceOne);
		System.out.println(instanceTwo);
	}
}
