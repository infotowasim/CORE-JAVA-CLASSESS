package com.wasim;

public class A {
	int x=100;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //100
		a1.test();
	}
	public void test() {
		System.out.println(this.x); //100
	}
}
