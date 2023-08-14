package com.wasim.charwithReadMethodUsingForLoop;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C://wasim69//test.txt");
			
			for (int i = 0; i < 5; i++) {
				System.out.println((char)fileReader.read()); // w a s i m 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
