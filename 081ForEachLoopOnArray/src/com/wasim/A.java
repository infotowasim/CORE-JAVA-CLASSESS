package com.wasim;

//for each loop only applicable on array u can't use anything else other then array.

public class A {

	public static void main(String[] args) {
		
		int [] arr=new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		
		for(int i:arr) { // i - i is a ordinary variable not array.
			             //arr- it automatically copy the first value from an array(arr) into i.
			System.out.println(i); // 10 20 30 40 50
		}

	}

}
