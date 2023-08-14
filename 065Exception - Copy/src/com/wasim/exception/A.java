package com.wasim.exception;

//Exception:- whenever a bad user given input , program execution will hold apdroply, this is called Exception.
//we can handle this exception using try and catch block.
//Exception class can handle any kind of Exception.

public class A {

	public static void main(String[] args) {
		try {
			int x = 100;
			int y = 0;
			int z = x / y;  //Exception
			System.out.println(10);
			System.out.println(20);

		} catch (Exception e) {
			e.printStackTrace();  // its help us to knowing us exact line number where Exception occur.
			System.out.println(e);
		}
		System.out.println("Hello");
	}
}
