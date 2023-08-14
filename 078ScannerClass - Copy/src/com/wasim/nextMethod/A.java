package com.wasim.nextMethod;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//(System.in) - it help us to read input.
//System.out - it help us to print output.
//next() method - it can  able to store only 1 String value or word.
//nextInt() - It help us to store Integer value. 
//nextFloat()-it help us to store Decimal value or Float value.
//nextBoolean()- it help us to store boolean value True or False.

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = scanner.next();
		System.out.println("Enter your name:"+name);
		
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		System.out.println("Enter your age:"+age);
		
		System.out.println("Enter youe weight:");
		float weight = scanner.nextFloat();
		System.out.println("Enter youe weight:"+weight);
		
		System.out.println("Plant is green in color:");
		boolean answer = scanner.nextBoolean();
		System.out.println("Plant is green in color:"+answer);
	}
}
