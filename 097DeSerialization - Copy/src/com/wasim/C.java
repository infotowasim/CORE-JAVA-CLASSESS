package com.wasim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class C {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("C://wasim69//file.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			A a = (A) objectInputStream.readObject();
			System.out.println(a.name);
			System.out.println(a.city);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
