package com.wasim;

//Here we Convert Bigger Data Type into Smaller Data Type.
//During the Explicit Down Casting Data lose might happen.

public class C {

	public static void main(String[] args) {
		short x=10;
		byte y=(byte) x; // force
		System.out.println(y);
	}
}
