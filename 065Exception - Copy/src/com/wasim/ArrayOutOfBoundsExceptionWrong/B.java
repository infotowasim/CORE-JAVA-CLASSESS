package com.wasim.ArrayOutOfBoundsExceptionWrong;

//Here also ArrayIndexOutOfBoundsException because Array size is 5 but u want to store 6th element according to condition of for loop.

public class B {

	public static void main(String[] args) {

		int[] x = new int[5];

		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;

		for (int i = 0; i < 6; i++) { // ArrayIndexOutOfBoundsException
			System.out.println(x[i]);
		}

	}

}
