package com.wasim;

//RunTime Polymorphism:- Here Overriding and Class UpCasting should done.
//Inheritance should happen.

public class B extends A{
	
	@Override
	public void test() {
		System.out.println(500);
	}

	public static void main(String[] args) {
		A a1=new B();
		a1.test();
	}
}
