package com.wasim;

//createNewFile() method- its a non static method present in file class.
//its responsible to create a new file.
//if the file is not present in the given path then it will create a new file and return a boolen value True.
//if already file is present in given path, it will never override the existing file.
//and create a new file, in such case as it will return false.
//Compile time exception mandatory to be return in try catch block, regardless of exception happen or not.

import java.io.File;

public class A {

	public static void main(String[] args) {
		try {
			File file=new File("C://wasim69//test.txt");
			boolean createNewFile = file.createNewFile();
			System.out.println(createNewFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
