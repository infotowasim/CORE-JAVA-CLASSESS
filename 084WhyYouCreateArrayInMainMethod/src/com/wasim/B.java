package com.wasim;

public class B {

	public static void main(String[] args) {
		
		int[] x=new int[5];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		
		B b1=new B();
		b1.test1(x);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	public void test1(int[] y) {
		y[0]=100;
		y[1]=200;
	}
}
