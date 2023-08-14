package com.wasim.createFileAutomatically;

// FileWriter help us to create file and also add or put data into that file.

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter=new FileWriter("C://wasim69//test3.txt");
			fileWriter.write(200);
			fileWriter.write("200");
			fileWriter.write("Mithu");
			char[] ch= {'z','y','x'};
			fileWriter.write(ch);
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
