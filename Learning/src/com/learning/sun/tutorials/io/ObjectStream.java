
package com.learning.sun.tutorials.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	private static final String FILE_NAME = "order.ser";
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Order order = new Order.OrderBuilder().setOrderId(1).setUnitCount(12).setItemDescription("Sample").setItemPrice(123).createOrder();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
		try{
			oos.writeObject(order);
		}finally{
			if( oos != null )oos.close();
		}

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
		try{
			Order o = (Order)ois.readObject();
			System.out.println(o);
		}finally{
			if( ois != null )ois.close();
		}
	}
	
	
}
