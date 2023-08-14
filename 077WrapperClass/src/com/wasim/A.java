package com.wasim;

//Wrapper Class used for converting Class to DataType and DataType to String . String to number and number to String.

public class A {

	public static void main(String[] args) {
		   String x="100";
		   int x1=Integer.parseInt(x);
		   float x2 = Float.parseFloat(x);
		   double x3 = Double.parseDouble(x);
		   boolean x4 = Boolean.parseBoolean(x);
		   short x5 = Short.parseShort(x);
		   byte x6 = Byte.parseByte(x);
		   long x7 = Long.parseLong(x);
		   
		   System.out.println(x1);
		   System.out.println(x2);
		   System.out.println(x3);
		   System.out.println(x4);
		   System.out.println(x5);
		   System.out.println(x6);
		   System.out.println(x7);
	}
}
