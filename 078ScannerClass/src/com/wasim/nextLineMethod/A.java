package com.wasim.nextLineMethod;

//Scanner Class - whenever user needs to give input in java to keyword , you use scanner class.
//(System.in) - it help us to read input.
//System.out - it help us to print output.
//nextLine()- it help us to store whole sentence or more then one word.

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name:");
		String description = scanner.nextLine();  //nextLine()- it help us to store whole sentence or more then one word.
		System.out.println("What is your name:"+description);
	}
}
