package com.wasim.repeatAgainAndAgainOutPutUsingTRUE;

// FileWriter fileWriter=new FileWriter("C://wasim69//test3.txt",true) - true help us to repeat the o/p how many times u run it will repeat that much time.suppose u run 3 times so o/p should repeat 3 times.
// true - it should able to add extra content or modify, means it should able to override existing file.

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C://wasim69//test3.txt", true);
			fileWriter.write(300);
			fileWriter.write("300");
			fileWriter.write("WASIM");

			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
