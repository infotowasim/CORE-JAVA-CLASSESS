package com.wasim;

//Here, We can store Child Class Object address into Parent class reference Variable.
//its only applicable on sub-class,(Inheritance should happen), its not applicable on non sub-class.

public class B extends A{

	public static void main(String[] args) {
		A a1=new B();
		a1=new C();

	}

}
