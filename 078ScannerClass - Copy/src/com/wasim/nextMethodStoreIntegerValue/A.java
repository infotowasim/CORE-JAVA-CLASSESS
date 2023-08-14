package com.wasim.nextMethodStoreIntegerValue;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//(System.in) - it help us to read input.
//System.out - it help us to print output.
//nextInt() - It help us to store Integer value. 

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter youe age");
		int age = scanner.nextInt();  //nextInt() - It help us to store Integer value.
		System.out.println("Enter youe age:"+age);
	}
}
