package com.wasim;

//Default value of reference variable is Null or Object Address
//if RV is created in method then its a Local Variable But
//if u make RV is static it has Global Access

public class A {
	static A a1;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1); // object address
		a1.test();
	}
	public void test() {
		System.out.println(a1); // null
	}

}
