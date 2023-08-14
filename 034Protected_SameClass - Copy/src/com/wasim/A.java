package com.wasim;

//if Variable and Method make Protected in the same class, then YES its Accisable.

public class A {
	protected int x=10;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //10
		a1.test();
	}
	protected void test() {
		System.out.println(100); //100
	}

}
