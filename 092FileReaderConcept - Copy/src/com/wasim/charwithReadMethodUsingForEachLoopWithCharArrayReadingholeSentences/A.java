package com.wasim.charwithReadMethodUsingForEachLoopWithCharArrayReadingholeSentences;

//I want to read or count or print (wasim akram from murshidabad).
//if I use below rules then only I can read 11 value. causes of sentence length I given 11.
//fileReader - we use fileReader for reading the number of character from the given path.
//char[] ch = new char[11] - its character Array. it means I want to read only 11 character from given path.
//fileReader.read(ch) - its means I will read 11 characters and store into Array. once an Array data in present then
//for (char c : ch) - used forEach loop for reading data in Array.

import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("C://wasim69//test.txt"); // fileReader - make it Dynamic. we use
																				// fileReader for
																				// finding the number of character from
																				// the given path.

			char[] ch = new char[11]; // its character Array. it means I want to read only 11 character from given
										// path.
			fileReader.read(ch); // its means I will read 11 characters and store into Array.
									// once an Array data in present then
			for (char c : ch) { // used forEach loop for reading data in Array.
				System.out.print(c); // print data
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
