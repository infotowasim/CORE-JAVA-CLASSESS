package com.wasim.readMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;

//File - U can write anything into the file using file class.
//File Reader - if U want to read the content from the file, u have to use File Reader class.
//it can't create file, file should be there then only u can able to read it.
//File Reader should give compile time exception. so , u have to surrounding in try-catch block, Regardless Exception happen or not u have to use try catch block.
//File Writer - if u want to write the content from the file U have to use File Writer class.
//read() method - it help us to read only One character from the file, and it will convert to unique code value like p=112.
// read method able to return only integer value.

public class A {

	public static void main(String[] args) {
		
		try {
			FileReader fileReader=new FileReader("C://wasim69//test.txt");
			System.out.println(fileReader.read()); //w-119
			System.out.println(fileReader.read()); //a-97
			System.out.println(fileReader.read()); //s-115
			System.out.println(fileReader.read()); //i-105
			System.out.println(fileReader.read()); //m-109
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}