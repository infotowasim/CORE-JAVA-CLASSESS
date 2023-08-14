package com.wasim.ArrayOutOfBoundsExceptionWrong;

//if, Size of array is 5 so, I can store only 5 element.
//if u try to store 6th element but we don't have this index at all so, we existing the Index range
//so, We should get ArrayIndexOutOfBoundsException.

public class A {

	public static void main(String[] args) {
		
		int [] x=new int[5];
		
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		x[5]=60;  //ArrayIndexOutOfBoundsException
		
		for(int i=0; i<5; i++) {
			System.out.println(x[i]);
		}
	}
}
