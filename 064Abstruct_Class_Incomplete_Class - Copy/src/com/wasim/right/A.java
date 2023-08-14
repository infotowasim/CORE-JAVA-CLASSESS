package com.wasim.right;

//Abstract class can consist Complete and In-Complete method.
//Its can consist Static and Non-Static variable.
//for creating In-Complete method u have to mandatory to use Abstract Keyword.
//Abstract Class can consist main method.
//AC can consist Reference Variable .
//AC can't create object of AC.
//Inheritance and Override should happen.
//Its can't support Multiple Inheritance.

public abstract class A {
	int x = 10;
	static int y = 20;

	public abstract void test1();

	public void test2() {
		System.out.println(200);
	}

	public static void main(String[] args) {
		A a1; // U can't create object so , I can't Access int x amd test() method see next
				// prgm.
		System.out.println(A.y);
	}
}
