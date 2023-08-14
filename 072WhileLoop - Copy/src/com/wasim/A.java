package com.wasim;

//for() loop:- where the iteration are fixed better go with for() loop.
//while() loop:- where we don't know how many times u repeat loop then., better to go with while() loop.

public class A {

	public static void main(String[] args) {

		int x = 0;
		while (x < 6) {
			System.out.println(x);
			x++; // its used like break,if u used then it will print and go back to while loop
					// and increase number 1 and its print. if, u don't use x++ then, it will not
					// stop, gone to infinity.
		}
	}
}
