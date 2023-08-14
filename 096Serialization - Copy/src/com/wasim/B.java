package com.wasim;

// Serialization - In serialization we can convert objects 0's and 1's . then you can store the object state into a file system.
// it help us to store object state permanently into the file.
// FileOutputStream - its a special file, which can return 0's & 1's. we can create file or object.
// u have to close FileOutputStream using fileOutputStream.close()method.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {

	public static void main(String[] args) {
		A a1=new A();
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C://wasim69//file.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(a1);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
