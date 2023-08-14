package com.wasim;

//Jodi interface ar class thake but kono inheritance override chara ee thahole 
//main method ar class mane last class ay agay EXTENDS tar por IMPLEMENTS asbe 
//always EXTENDS agay asbe tar por IMPLEMENTS

public class C extends B implements A{
	
	@Override
	public void test1() {
		System.out.println(100);
	}

	public static void main(String[] args) {
		C c1=new C();
		c1.test1();
		c1.test2();
	}
}
