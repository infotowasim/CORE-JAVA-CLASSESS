package com.wasim.charwithReadMethodUsingForLoopReadingholeSentences_AnotherWay;

// char[] ch=new char[(int)file.length()] - When u create a character Array , it has to be integer value. it can't be long value.
//I want to read or count or print (wasim akram from murshidabad).
//if I use below rules then only I can read hole value. causes of sentence length I given file.length()method.
//fileReader - we use fileReader for reading the number of character from the given path,the taken help of File class.
//file.length() - we use fileReader for finding the number of character from the given path,the taken help of File class.
//fileReader.read(ch) - its means I will read hole characters and store into Array. once an Array data in present then
//for (char c : ch) - used forEach loop for reading data in Array.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B {

	public static void main(String[] args) {
		File file=new File("C://wasim69//test.txt");
		try {
			FileReader fileReader=new FileReader(file);
			char[] ch=new char[(int)file.length()];
			fileReader.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
