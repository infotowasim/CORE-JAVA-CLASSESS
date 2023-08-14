package com.wasim.LambdasExpression4;

//Lambdas Expression help us to develop code with less line.
//Its only applicable with one Functional Interface.
//u can't apply lambdas Expression on Audinary Interface.
//no need to do Implementation.
//no need to do Override.
//no need to create reference object of that class.
//All are u can do with one line using Lambdas Expression.
//more then one method it will not work.

@FunctionalInterface
public interface A {
	public void test1();
	
	default void test2() {
		System.out.println(200);
	}
	default void test3() {
		System.out.println(300);
	}
	default void test4() {
		System.out.println(400);
	}

}
