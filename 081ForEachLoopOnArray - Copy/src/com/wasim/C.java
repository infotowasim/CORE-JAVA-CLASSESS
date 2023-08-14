package com.wasim;

// there are 5 size of an array but u initialize only 3 value so remaining value should be 0 because of data type integer.
//for each loop only applicable on array u can't use anything else other then array.

public class C {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		for (int i : array) { // i - i is a ordinary variable not array.
			                  //array- it automatically copy the first value from an array into i.
			System.out.println(i); // 10 20 30 0 0 
		}

	}

}
