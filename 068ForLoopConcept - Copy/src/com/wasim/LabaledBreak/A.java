package com.wasim.LabaledBreak;

public class A {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			x:if (i==3) {
				break x;
			}
			System.out.println(i); // 0 1 2 3 4 
		}

	}

}
