package com.wasim.forloopRules2;

public class A {

	public static void main(String[] args) {

		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(i); // 0 1 2 3 4
		}
		System.out.println(i); // 5 // what was the last value i=4, it was 4 it become 5. then the condition
								// fail. now it print 5.
	}
}
