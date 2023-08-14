package com.wasim.NumberFormatExceptionRightPrgm;

public class A {

	public static void main(String[] args) {
		
		try {
			String x="10";
			float val = Float.parseFloat(x);
			System.out.println(val); // 10.0
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
