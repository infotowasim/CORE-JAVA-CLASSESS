package com.wasim;

public class A {
	A() {

		System.out.println(100); // always this sop ar agay hobe tobe ee program cholbe noile noi jemon ay prgm
									// ta
		// this(500);//error
	}

	A(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		A a1 = new A();
	}
}
