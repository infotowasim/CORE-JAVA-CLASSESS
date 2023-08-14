package com.wasim;

//Here, We can store Parent Class Object address into Child class reference Variable.
//its only applicable on sub-class,(Inheritance should happen), its not applicable on non sub-class.

public class B extends A{

	public static void main(String[] args) {
		B b1=(B) new A(); // causes of Class Down casting 
		C c1=(C) new A(); // causes of Class Down casting
		

	}

}
