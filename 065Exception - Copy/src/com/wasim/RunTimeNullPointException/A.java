package com.wasim.RunTimeNullPointException;

//Null Pointer Exception:- with Null Reference variable when we access non-static members, we get NPE, to handle NPE we use NPE class.
//2 kind of value static can be store-object address and null value.
//when ur reference variable is null and the null reference variable you r trying to access non-static members then, give null pointer exception

public class A {
	static A a1;
	int x=10;
	public static void main(String[] args) {
		try {
			System.out.println(a1.x); //NullPointerException
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
