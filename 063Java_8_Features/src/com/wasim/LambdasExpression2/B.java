package com.wasim.LambdasExpression2;

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
		A a1= (int x)->{
			System.out.println(x);
		};
		a1.test(100); 
	}
}
