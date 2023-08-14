package com.wasim.NumberFormatExceptionWrongPrgm;

//when an invalid String to number conversation is done, we will get Number Format Exception, to handle we use NFE Class.

public class A {

	public static void main(String[] args) {
		try {
			String x="fghjkl";
			float val=Float.parseFloat(x); //NumberFormatException
			System.out.println(val);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
