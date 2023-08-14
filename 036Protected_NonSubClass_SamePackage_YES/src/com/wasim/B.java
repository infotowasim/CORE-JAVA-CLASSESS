package com.wasim;

//Inheritance should not be happen.

public class B {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //10
		a1.test();                //100
	} 
}
