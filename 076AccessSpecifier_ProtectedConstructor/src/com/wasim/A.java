package com.wasim;

//if u make a constructor protected then, its object can be created only inside same class and same package.
//protected same as default.

public class A {
	protected A() {
		
	}

	public static void main(String[] args) {
		A a1=new A();

	}

}
