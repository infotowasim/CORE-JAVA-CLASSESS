package com.wasim.ContinueKeyword;

// 0 to 4 all value will be print except 3 because of continue keyword.
//(3==3) true so it will not print.
//(0==3)=0, (1==3)=1, (2==3)=2, (4==3)=4 it will print because of false value.

public class A {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i); // 0 1 2  4 
		}

	}

}
