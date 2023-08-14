package com.wasim;

//if Variable and Method make Default in the same class, then YES its Accisable.

public class A {
	int x=10;

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //10
		a1.test();
	}
	public void test() {
		System.out.println(100); //100
	} 

}
