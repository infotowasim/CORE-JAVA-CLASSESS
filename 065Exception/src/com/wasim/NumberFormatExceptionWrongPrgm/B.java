package com.wasim.NumberFormatExceptionWrongPrgm;

public class B {

	public static void main(String[] args) {
		
		try {
			Integer.parseInt("dfghjk");		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
