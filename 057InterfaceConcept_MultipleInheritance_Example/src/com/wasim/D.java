package com.wasim;

public class D implements C{
	
	@Override
	public void test1() {
		System.out.println(100);
	}
	
	@Override
	public void test2() {
		System.out.println(200);
	}
	
	@Override
	public void test3() {
		System.out.println(300);
	}

	public static void main(String[] args) {
		D d1=new D();
		d1.test1();
		d1.test2();
		d1.test3();
	}
}
