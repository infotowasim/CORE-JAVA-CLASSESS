package com.wasim;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {

	public static void main(String[] args) {
		A a1 = new A();

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C://wasim69//file.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(a1);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
