package com.wasim;

public class A {
	A(){ //3
		this(500); //4 8
	} //9
	A(int x){ //5
		System.out.println(x); //6
	} //7

	public static void main(String[] args) { //1
		A a1=new A(); //2 10
	}//11
}
