package com.wasim.ATMCardProgram2;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String condition="yes";
		
		while (condition.equals("yes")) {
			System.out.println("Enter the amount:");
			
			int amount = scanner.nextInt();
			System.out.println("Please collect the cash");
			
			System.out.println("Do you want to continue(yes/no)");
			condition=scanner.next();
		}

	}

}
