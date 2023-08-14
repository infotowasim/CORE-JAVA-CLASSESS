package com.uniquecodeValue;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	private static int read;

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C://wasim69//test.txt");
			
			for(int i=0; i<5; i++) {
				read = fileReader.read();
				System.out.println(read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
