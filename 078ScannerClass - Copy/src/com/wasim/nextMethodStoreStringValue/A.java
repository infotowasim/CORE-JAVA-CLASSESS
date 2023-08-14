package com.wasim.nextMethodStoreStringValue;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//next() method - it can  able to store only 1 String value or word.
//(System.in) - it help us to read input.
//System.out - it help us to print output.

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.next();  //next() method - it can  able to store only 1 String value or word.
		System.out.println("Enter youe name:"+name);
	}
}
