package com.wasim.LambdasExpression1;

//Lambdas Expression help us to develop code with less line.
//Its only applicable with one Functional Interface.
//u can't apply lambdas Expression on Audinary Interface.
//no need to do Implementation.
//no need to do Override.
//no need to create reference object of that class.
//All are u can do with one line using Lambdas Expression.
//more then one method it will not work.

public class B {

	public static void main(String[] args) {
		A a1=()->{  // A a1 is a reference variable of an Interface.
			System.out.println(100);
			System.out.println(200);
			System.out.println(300);
			System.out.println(400);
			System.out.println(500);
		};
		a1.test();
	}

}
