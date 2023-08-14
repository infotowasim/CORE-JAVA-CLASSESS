package com.wasim;

//in java, when u write a number, number always treated as integer but if u done costing with byte then it will treated as byte

public class A {
	A(int i){
		System.out.println("int");
	}
	A(byte i){
		System.out.println("byte");
	}

	public static void main(String[] args) {
		A a1=new A((byte)100);//Byte 

	}

}
