package com.wasim;

//Here, We can create more then one Constructor in same class
//but insure that Created Constructor should be different number or Different type of Argument
//Variable name and Argument name can be same but number of Argument should be different

public class A {
	A(){
		System.out.println();
	}
	A (int x){
		System.out.println(x);
	}
	A (int x, int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		A a1=new A(100);
		A a2=new A(200);
		A a3=new A(300,400);
	}

}
