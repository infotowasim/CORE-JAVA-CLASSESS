package com.wasim;

//in java, when u write a number, number always treated as integer but if u done costing with long then it will treated as long

public class A {
	A(int i){
		System.out.println("int");
	}
	A(long i){
		System.out.println("long");
	}

	public static void main(String[] args) {
		A a1=new A(100l);

	}

}
