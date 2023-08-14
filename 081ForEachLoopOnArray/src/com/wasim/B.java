package com.wasim;

//for each loop only applicable on array u can't use anything else other then array.

public class B {

	public static void main(String[] args) {
		
		int [] x= {10,20,30,40,50};
		
		for(int i : x) { // i - i is a ordinary variable not array.
			            //x- it automatically copy the first value from an array(x) into i.
			System.out.println(i); // 10 20 30 40 50
		}

	}

}
