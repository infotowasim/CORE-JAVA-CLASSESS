package com.wasim.wrong;

//Abstract class can consist Complete and In-Complete method.
//Its can consist Static and Non-Static variable.
//for creating In-Complete method u have to mandatory to use Abstract Keyword.
//Abstract Class can consist main method.
//AC can consist Reference Variable .
//AC can't create object of AC.
//Inheritance and Override should happen.
//Its can't support Multiple Inheritance.

abstract class A {
	int x=10;        // Non-Static variable.
	static int y=20; //Static Variable.
	
	public abstract void test1(); // Incomplete Method.
	
	public void test2() {         // Complete Method.
		System.out.println(200);
	}

	public static void main(String[] args) {
//		A a1=new A(); // U can't create Object of Abstract class.
	}
}
