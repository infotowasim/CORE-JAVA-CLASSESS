package com.wasim.notExistFalse;

//("D://wasim10//test.txt")- file path.
//Exist() method - its a method present in file class.
//it help us to check that file is there are not it will check.
//if its present then return True.
//if not present then return False.

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file=new File("D://wasim10//test.txt");
		boolean val = file.exists();
		System.out.println(val);
	}
}
