package com.wasim;

//BufferedWriter - it help us to improve reading performance. it has exclusive newLine() method.
//in BufferedWriter you can't give file path, if you give file path then it will not work.you have to give the reference of File Writer.
//newLine() - it help us for new lining.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C://wasim69//test2.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(100); // in file d
			bufferedWriter.newLine();

			bufferedWriter.write("100"); // in file 100
			bufferedWriter.newLine();

			bufferedWriter.write("shikh"); // in file shikh
			bufferedWriter.newLine();

			char[] ch = { 'g', 'h', 'j', 'k' };
			bufferedWriter.write(ch); //// in file g h j k

			bufferedWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
