package com.wasim;

//This keyword only applicable with Non-Static variable

public class A {
	int x=10;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //10
		a1.test();
	}
	public void test() {
		System.out.println(this.x); //10
	}
}
