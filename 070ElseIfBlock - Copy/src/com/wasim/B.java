package com.wasim;

//If, if and else if has same value then , 1st preferences will be a always if condition.

public class B {

	public static void main(String[] args) {
		int x=10;
		if(x==10) {
			System.out.println("10if");
		}
		else if (x==10) {
			System.out.println("10elseif");
		}
		else {
			System.out.println("Not Matching");
		}
	}
}
