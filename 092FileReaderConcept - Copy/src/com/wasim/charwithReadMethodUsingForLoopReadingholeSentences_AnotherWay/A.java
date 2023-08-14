package com.wasim.charwithReadMethodUsingForLoopReadingholeSentences_AnotherWay;

//I want to count number of character into given path.
// File class - its used for length method.
// fileReader - it don't have method. it only can read it can't count
// length() - its a part of file class . it can't count and also it can't count the content.
// file.length() - its hold the path.its long value is the return type.
// fileReader.read() - it read() method read the content and convert into a encode value . so, you have to do type casting and convert to back to back character value.
// read() method - return type is int.

import java.io.File;
import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		try {
			File file = new File("C://wasim69//test.txt"); // File class - its used for length method.
			FileReader fileReader = new FileReader(file); // fileReader - it don't have method. it only can read it
															// can't count

			for (int i = 0; i < file.length(); i++) { // length() - its a part of file class . it can't count and also
														// it can't count the content.
														// file.length() - its hold the path.its long value is the
														// return type.
				System.out.print((char) fileReader.read()); // wasim akram from murshidabad
															// fileReader.read() - it read() method read the content and
															// convert into a encode value . so, you have to do type
															// casting and convert to back to back character value.
			                                               // read() method return type is int.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
