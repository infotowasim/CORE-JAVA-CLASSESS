package com.wasim;

//mkdir()- it help us to create a new folder. it stand for make directory.
//its a non static method present in file class and return value is boolean.
//which hence a create folder in the given path folder created return True.
// if folder is Already present in it, it not override the file and create a new one in such case in return False.

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file = new File("C://mithu69//t1"); // at a time only one folder can create using this technique.here 2
													// folder generated so i run 2 times one by one.
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
	}
}
