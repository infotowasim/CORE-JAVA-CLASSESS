package com.wasim;

//Here we Convert Bigger Data Type into Smaller Data Type.
//During the Explicit Down Casting Data lose might happen.

public class A {

	public static void main(String[] args) {
		long x=10;
		int y=(int) x; // force kore 
		System.out.println(y);
	}
}
