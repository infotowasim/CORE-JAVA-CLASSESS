package com.wasim;

//Should same Constructor name and class name.
//Every time we create an object Constructor is called.
//U can write Constructor within class but outside main method.
//Constructor sends request to class for creating object.
//new keyword will call Constructor.
//get object address & stores that in reference variable.

public class A {
	A(){
		System.out.println(100);
	}

	public static void main(String[] args) {
		A a1=new A(); //joto bar object creation part chalabe toto bar op pabe 100
		A a2=new A(); //100
		A a3=new A(); //100
	}

}
