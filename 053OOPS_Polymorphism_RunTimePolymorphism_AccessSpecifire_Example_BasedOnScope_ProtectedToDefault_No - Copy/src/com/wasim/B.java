package com.wasim;

//RunTime Polymorphism:- Here Overriding and Class UpCasting should done.
//Inheritance should happen.
//During Override Access Specifier Can be Increase then only its run.
//But its can't be decrease then it will not possible.
//Access Specifier(Protected to Default) No its Decrease so u can't do.

public class B extends A{
//	@Override
//	void test() { //Error
//		System.out.println(500);
//	}

	public static void main(String[] args) {
		A a1=new B();
		a1.test();
	}
}
