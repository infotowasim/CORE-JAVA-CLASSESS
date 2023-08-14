package com.wasim.ReferenceVariableInterface;

//Reference variable of Interface can be created but Reference object of Interface can't be created.
//Every Variable created in a Interface by default its final and static.

public class B {

	public static void main(String[] args) {
		A a1;
		System.out.println(A.ID);
		System.out.println(A.name);
	}
}
