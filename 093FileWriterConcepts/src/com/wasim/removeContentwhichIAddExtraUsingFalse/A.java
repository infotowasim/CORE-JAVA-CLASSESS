package com.wasim.removeContentwhichIAddExtraUsingFalse;

//FileWriter fileWriter=new FileWriter("C://wasim69//test3.txt",false) - if u use false then it will remove all content except 1st content.only 1st time running o/p will be present.

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C://wasim69//test3.txt", false);
			fileWriter.write(200);
			fileWriter.write("200");
			fileWriter.write("Mithu");
			char[] ch = { 'z', 'y', 'x' };
			fileWriter.write(ch);
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
