package com.wasim;

//Here we Convert Bigger Data Type into Smaller Data Type.
//During the Explicit Down Casting Data lose might happen.
//Long can't store decimal value that's only reason Explicit Happened.
// Data loss (0.3)

public class B {

	public static void main(String[] args) {
		float x=10.3f;
		long y=(long) x; //force 
		System.out.println(y);
	}
}
