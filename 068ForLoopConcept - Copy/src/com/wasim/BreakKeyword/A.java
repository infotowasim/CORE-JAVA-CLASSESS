package com.wasim.BreakKeyword;

// should print only false value till break before obey.
// 3==3 true so further will not print.
// (0==3)=0, (1==3)=1, (2==3)=2... it will print because of false value.

public class A {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i==3) {  // (==)-- compare integer value.
				break;   // used for exiting for loop. it can be used only within loop or switch.
				         // it will stop for loop adroply, nothing will continue further.
			}
			System.out.println(i); // 0 1 2 
		}

	}

}
