package com.wasim;
//Static and local variable name can be same
//if you access the class name then u can Access Static
public class B {

	static int y=100;
	public static void main(String[] args) {
		int y=200;
		System.out.println(B.y);

	}

}
