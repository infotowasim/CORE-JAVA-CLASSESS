package com.wasim;

//Static and local variable name can be same
//Local Variable - Preference is given to local
public class A {
	static int x=10; //static variable 

	public static void main(String[] args) {
		
		int x=20;  // Local Variable - Preference is given to local
		System.out.println(x);

	}

}
