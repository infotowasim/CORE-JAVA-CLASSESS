package com.wasim.LabaledBreak;

public class B {

	public static void main(String[] args) {
		x: for (int i = 0; i < 5; i++) {
			if (i==3) {
				break x;
			}
			System.out.println(i); // 0 1 2
		}

	}

}
