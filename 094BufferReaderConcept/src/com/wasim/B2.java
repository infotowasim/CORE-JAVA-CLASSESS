package com.wasim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B2 {

	public static void main(String[] args) {
		File file=new File("C://wasim69//test1.txt");
		try {
			FileReader fileReader=new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			for (int i = 0; i < file.length(); i++) {
				System.out.println(bufferedReader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
