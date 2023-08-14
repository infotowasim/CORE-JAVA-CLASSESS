package com.wasim.nextMethodStoreDecimalOrFloatValue;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//(System.in) - it help us to read input.
//System.out - it help us to print output.
//nextFloat()-it help us to store Decimal value or Float value.

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your weight");
		float weight = scanner.nextFloat();  // nextFloat()-it help us to store Decimal value or Float value.
		System.out.println("Enter your weight:"+weight);
	}
}
