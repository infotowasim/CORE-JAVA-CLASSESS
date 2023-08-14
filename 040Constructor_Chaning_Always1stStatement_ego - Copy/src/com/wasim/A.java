package com.wasim;

//while calling constructor this keyword can't be 2nd statement in another constructor.

public class A {
	A() {
		this(500);
		System.out.println(100);
	}

	A(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		A a1 = new A();
	}
}
