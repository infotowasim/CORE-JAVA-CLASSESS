package com.wasim.MultipleExceptionHandleusingException;

//Exception Class can handle Multiple kind type of exception.

public class A {
	static A a1;
	int x=10;
	int y=0;

	public static void main(String[] args) {
		
		try {
			int z=10/0; //ArithmeticException
			System.out.println(a1.x);  //NullPointerException
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
