package com.wasim;

//in java, when u write a number, number always treated as integer

public class A {
	A(int i){
		System.out.println("int");
	}
	A(byte i){
		System.out.println("byte");
	}

	public static void main(String[] args) {
		A a1=new A(100);//Integer 

	}

}
