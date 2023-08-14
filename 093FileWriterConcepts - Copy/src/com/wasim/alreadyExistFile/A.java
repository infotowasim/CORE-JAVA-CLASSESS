package com.wasim.alreadyExistFile;

// FileWriter Class - it help us to create file and also override the existing file , which results in loses of previous data present in file
// FileWriter Class - it help us to write content into the file.
//fileWriter.close() - FileWriter will happen when you will close the FileWriter file.and then once close the file , it will save the content then you can see file.

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C://wasim69//test1.txt");

			fileWriter.write(100); // d

			fileWriter.write("100"); // 100

			fileWriter.write("wasim"); // wasim

			char[] ch = { 'a', 'b', 'c', 'd', 'e' };
			fileWriter.write(ch); // a b c d e

			fileWriter.close(); // FileWriter will happen when you will close the FileWriter file.and then once
								// close the file , it will save the content then you can see file.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
