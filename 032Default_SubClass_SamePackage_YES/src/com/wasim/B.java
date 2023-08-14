package com.wasim;

//if Variable and Method make Default in the sub class and same package, then YES its Accisable.
//Inheritance should be happen

public class B extends A{

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.x); //10
		b1.test();                //100
	}
}
