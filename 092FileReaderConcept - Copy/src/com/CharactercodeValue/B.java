package com.CharactercodeValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	public static void main(String[] args) {
		File file=new File("C://wasim69//test.txt");
		
		try {
			FileReader fileReader=new FileReader(file);
			char[] ch=new char[(int) file.length()];
			fileReader.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
