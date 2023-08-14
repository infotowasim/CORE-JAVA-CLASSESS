package com.wasim;

public class A {
	A (int x){
		System.out.println(x);
	}
	A(float y){
		System.out.println(y);
	}
	public static void main(String[] args) {
		A a1=new A(100);
		A a2=new A(100.33f);
	}

}
