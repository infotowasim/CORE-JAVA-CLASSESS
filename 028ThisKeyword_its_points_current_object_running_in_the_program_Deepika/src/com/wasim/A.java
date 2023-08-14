package com.wasim;

//this keyword only points to current object running in the program.

public class A {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1); //com.wasim.A@15db9742
		a1.test();              //com.wasim.A@15db9742
		
		System.out.println("-------------");
		
		A a2=new A();
		System.out.println(a2);  //com.wasim.A@6d06d69c
		a2.test();               //com.wasim.A@6d06d69c
	}
	public void test() {
		System.out.println(this); //com.wasim.A@15db9742
	}                             //com.wasim.A@6d06d69c

}
