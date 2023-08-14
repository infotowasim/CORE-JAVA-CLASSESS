package com.wasim;

//Data Hiding is a part of Encapsulation , but Data Hiding and Encapsulation are Different.
//u should make private of Non-Static Variable.
//U can't directly Access the variable but, U can Interact the variable only via getter & setter, Publicly define getter & setter. 

public class B extends A{

	public static void main(String[] args) {
		B b1=new B();
		b1.setName("Wasim");
		System.out.println(b1.getName());		
	}
}
