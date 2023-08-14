package com.mithu;

//Inheritance should be happen and Import should be done because of different package.
//Protected is Accessible in same package and a different package only throws Inheritance if Inheritance is not happenning then protected members cant be Accessed

import com.wasim.A;

public class B extends A {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x); // 10
		b1.test(); // 100
	}
}
