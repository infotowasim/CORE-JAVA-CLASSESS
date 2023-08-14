package com.wasim;

//Variable name can be same and also Argument number can be same but Data type should be different.

public class B {
	B(int i){
		System.out.println(i);
	}
	B(char i){
		System.out.println(i);
	}
	B(float i){
		System.out.println(i);
	}
	B(String i){
		System.out.println(i);
	}

	public static void main(String[] args) {
		B a1=new B(100);
		B a2=new B('a');
		B a3=new B(10.1f);
		B a4=new B("wasim");

	}

}
