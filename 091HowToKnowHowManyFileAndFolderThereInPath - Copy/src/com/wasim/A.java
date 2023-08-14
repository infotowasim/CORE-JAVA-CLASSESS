package com.wasim;

//if u want to return names, u have to store an array . Array can store collections of value it is.

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file = new File("C://wasim69");
		String[] name = file.list(); // we can get all file and folders names present in given path.its non static
										// method present in file class.whoes return type is String Array.

		for (String s : name) {     // u have created file before fetching folder and file. 
			System.out.println(s);  // f1
									// f2
									// test.txt
									// test1.txt
									// test2.txt
		}
	}
}
