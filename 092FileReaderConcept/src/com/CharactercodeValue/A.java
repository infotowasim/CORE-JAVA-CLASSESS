package com.CharactercodeValue;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C://wasim69//test.txt");
			char[] ch=new char[5];
			fileReader.read(ch);
			for (char c : ch) {
				System.out.print(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
