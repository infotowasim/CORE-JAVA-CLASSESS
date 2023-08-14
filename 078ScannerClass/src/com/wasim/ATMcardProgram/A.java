package com.wasim.ATMcardProgram;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("Enter your pin number:");
			int pinNumber = scanner.nextInt();

			if (pinNumber == 1234) {
				System.out.println("Welcome");
				break;
			} else {
				System.out.println("Invalid pin number");
			}
			if (i == 2) {
				System.out.println("Card is blocked");
			}
		}
	}
}