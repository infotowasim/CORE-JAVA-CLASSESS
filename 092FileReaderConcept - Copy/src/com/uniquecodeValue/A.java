package com.uniquecodeValue;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C://wasim69//test.txt");
			System.out.println(fileReader.read());
			System.out.println(fileReader.read());
			System.out.println(fileReader.read());
			System.out.println(fileReader.read());
			System.out.println(fileReader.read());
			System.out.println(fileReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
