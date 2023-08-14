package com.wasim.deletedOrDropAllContentUsingFlush;

import java.io.FileWriter;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C://wasim69//test4.txt");

			fileWriter.write(100); // d

			fileWriter.write("100"); // 100

			fileWriter.write("wasim"); // wasim

			char[] ch = { 'a', 'b', 'c', 'd', 'e' };
			fileWriter.write(ch); // a b c d e
			
			fileWriter.flush();
			
			fileWriter.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
