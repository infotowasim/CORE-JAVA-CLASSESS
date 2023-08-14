package com.wasim;

public class A {
	A(){ //3
		this(100);//4 13
	} //14

	public A(int x) { //5
		this(200,300); //6 11
	} //12

	public A(int x, int y) { //7
		System.out.println(x); //200   8
		System.out.println(y); //300   9
	} //10

	public static void main(String[] args) { //1
		A a1=new A(); //2 15

	} //16

}
