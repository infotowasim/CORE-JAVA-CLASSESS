package com.wasim;

//BufferReader - It help us to improve the file Reading performance. it has the exclusive ReadLine() method.
//in BufferReader you can't create file path if u give then it will not work. in BufferReader u have to give the reference of FileReader. 
//readLine() - it help us to read the content line by line or character by character.
//it only present in BufferReader Class.it not present in FileReader class.it's return type is String value.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A2 {

	public static void main(String[] args) {
		
		
		try {
			File file=new File("C://wasim69//test.txt");
			System.out.println(file.length()); // length
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			for (int i = 0; i <file.length(); i++) {
				System.out.println(bufferedReader.readLine());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
