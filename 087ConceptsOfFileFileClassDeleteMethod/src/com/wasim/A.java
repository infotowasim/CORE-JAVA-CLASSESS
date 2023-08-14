package com.wasim;

//("C://wasim69//test.txt")- path of file.
//Delete() method- its a method present in file class.
//whose return value is boolean.
//if file is deleted then it will return true.
//if file is not deleted or not present then return false.

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file=new File("C://wasim69//test.txt");
		boolean delete = file.delete();
		System.out.println(delete);

	}

}
