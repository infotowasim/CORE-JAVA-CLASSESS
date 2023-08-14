package com.wasim.ArrayOutOfBoundsExceptionRight;

public class A {

	public static void main(String[] args) {
		
		try {
			int[] x = new int[5];

			x[0] = 10;
			x[1] = 20;
			x[2] = 30;
			x[3] = 40;
			x[4] = 50;

			for (int i = 0; i < 5; i++) { // ArrayIndexOutOfBoundsException
				System.out.println(x[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome");

	}

}
