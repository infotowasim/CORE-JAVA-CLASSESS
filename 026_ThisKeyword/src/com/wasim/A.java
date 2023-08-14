package com.wasim;

//this keyword help us to hold object address.
//its a special reference variable created automatically to store object address.

public class A {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1); //com.wasim.A@15db9742
		a1.test();
	}
	public void test() {
		System.out.println(this); //com.wasim.A@15db9742 // 'this' is printing object address. 
	}
}
