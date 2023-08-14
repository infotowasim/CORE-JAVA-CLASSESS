package com.wasim;

//this keyword only use for calling from One Constructor to Another Constructor.
//U can't call except Constructor like Method,
//U can't use this keyword to call a constructor from a method. 

public class A {
	A(){ //6
		System.out.println(500); //7
	} //8
	A(int x){ //3
		this(); //4
	} //5

	public static void main(String[] args) { //1
		A a1=new A(100);  //2 9
	} //10
}
