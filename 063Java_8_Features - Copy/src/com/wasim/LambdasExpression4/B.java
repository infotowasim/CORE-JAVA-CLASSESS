package com.wasim.LambdasExpression4;

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
		A a1=()->{
			System.out.println(100);
		};
		a1.test1();
		a1.test2();
		a1.test3();
		a1.test4();
	}
}
