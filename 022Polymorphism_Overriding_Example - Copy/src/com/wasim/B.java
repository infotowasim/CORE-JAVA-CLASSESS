package com.wasim;

//It help us to Inherit a method from Parents class to child class.
//it help us to modify the logic of Inherit method in child class.
//by once a gain creating the method with the same signature in child class.

public class B extends A{
	@Override             //Override Annotation use for verifying weather overriding is happen or not.
	public void test() {  //if override is not happening then we would get error.
		System.out.println(500);
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
	}
}
