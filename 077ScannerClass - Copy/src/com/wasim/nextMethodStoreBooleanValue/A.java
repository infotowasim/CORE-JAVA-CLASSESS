package com.wasim.nextMethodStoreBooleanValue;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//(System.in) - it help us to read input.
//System.out - it help us to print output.
//nextBoolean()- it help us to store boolean value True or False.

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Plant is green in color");
		boolean answer = scanner.nextBoolean();  //nextBoolean()- it help us to store boolean value True or False.
		System.out.println("Plant is green in color:"+answer);
	}
}
