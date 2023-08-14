package com.wasim.charwithReadMethodUsingForLoop;

//(char)fileReader.read() - here type casting happened. It will print character, what u gave in file or saved in file in given path.
//After reading all character, further reading anything like (fileReader.read()) then it keep return -1. its rules .then only u understood u reached end of file. there are nothing further.

//File - U can write anything into the file using file class.
//File Reader - if U want to read the content from the file, u have to use File Reader class.
//it can't create file, file should be there then only u can able to read it.
//File Reader should give compile time exception. so , u have to surrounding in try-catch block, Regardless Exception happen or not u have to use try catch block.
//File Writer - if u want to write the content from the file U have to use File Writer class.
//read() method - it help us to read only One character from the file, and it will convert to unique code value like p=112.
//read method able to return only integer value.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("C://wasim69//test.txt");
			System.out.println((char) fileReader.read()); // w
			System.out.println((char) fileReader.read()); // a
			System.out.println((char) fileReader.read()); // s
			System.out.println((char) fileReader.read()); // i
			System.out.println((char) fileReader.read()); // m
			System.out.println(fileReader.read()); //-1
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
