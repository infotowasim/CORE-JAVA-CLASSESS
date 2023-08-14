package com.wasim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C://wasim69//test1.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
				System.out.println(bufferedReader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
