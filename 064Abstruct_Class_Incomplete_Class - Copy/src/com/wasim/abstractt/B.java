package com.wasim.abstractt;

//Abstract class can consist Complete and In-Complete method.
//Its can consist Static and Non-Static variable.
//for creating In-Complete method u have to mandatory to use Abstract Keyword.
//Abstract Class can consist main method.
//AC can consist Reference Variable .
//AC can't create object of AC.
//Inheritance and Override should happen.
//Its can't support Multiple Inheritance.

public class B extends A{

	public static void main(String[] args) {
		B b1=new B();
		b1.test1();
		System.out.println(b1.x);
	}
}
