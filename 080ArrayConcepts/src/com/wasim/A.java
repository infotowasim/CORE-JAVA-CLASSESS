package com.wasim;

// for each loop only applicable on array u can't use anything else other then array.

import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		int [] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for (int i = 0; i < arr.length; i++) {  //arr.length- non static variable.
			                                    //SOP- help us to keep the size of an array.
			System.out.println(arr[i]); // 10 20 30
		}
	}
}
