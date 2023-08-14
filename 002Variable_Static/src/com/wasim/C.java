package com.wasim;

public class C {
	static int x=30;
	
	public static void main(String[] args) {
		
		System.out.println(x);
		
		C c1=new C();
		c1.test();
	}
	
	public void test() {
		System.out.println(C.x);
	}

}
