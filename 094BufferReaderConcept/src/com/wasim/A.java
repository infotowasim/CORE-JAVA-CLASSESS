package com.wasim;

//BufferReader - It help us to improve the file Reading performance. it has the exclusive ReadLine() method.
//in BufferReader you can't create file path if u give then it will not work. in BufferReader u have to give the reference of FileReader. 
//readLine() - it help us to read the content line by line or character by character.
//it only present in BufferReader Class.it not present in FileReader class.it's return type is String value.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		
		
		try {
			FileReader fileReader = new FileReader("C://wasim69//test.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
	
			System.out.println(bufferedReader.readLine()); ////wasim akram from murshidabad
			System.out.println(bufferedReader.readLine()); //I an a softwer Engineer guy
			System.out.println(bufferedReader.readLine()); //I am going to hard work on my study
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
