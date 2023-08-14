package com.wasim;

//if Variable and Method make Private in the same class, then YES its Accisable.

public class A {
	private int x=10;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x);
		a1.test();
	}
	private void test() {
		System.out.println(100);
	}
}
