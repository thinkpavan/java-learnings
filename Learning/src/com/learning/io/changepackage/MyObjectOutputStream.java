package com.learning.io.changepackage;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
	protected MyObjectOutputStream() throws IOException, SecurityException {
		super();
	}
	
	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeClassDescriptor(ObjectStreamClass desc)
			throws IOException {
		super.writeClassDescriptor(desc);
		System.out.println(desc.getName());
	}

}