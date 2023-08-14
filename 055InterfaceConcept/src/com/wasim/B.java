package com.wasim;

//Interface to class----> Implements.
//should happen Override.

public class B implements A{
	@Override
	public void test() {
		System.out.println(500);
	}

	public static void main(String[] args) {
		B b1=new B();
		b1.test();
	}
}
