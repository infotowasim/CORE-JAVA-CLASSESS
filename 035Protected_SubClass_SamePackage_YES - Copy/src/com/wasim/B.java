package com.wasim;

//Inheritance should be happen.

public class B extends A{

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.x);  //10
		b1.test();                 //100
	}
}
