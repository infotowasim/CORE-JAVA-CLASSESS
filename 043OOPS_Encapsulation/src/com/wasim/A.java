package com.wasim;

//Wrapping of data with the methods that operate of data is called Encapsulation.Here Direct Access to the variable is avoided by making it private.
//publicly define getX and setX are created one the variable.

public class A {
	private int age;
	
	public void setAge(int age) { // Setter used for Initialize non-static variable. this.variable=variable;
		this.age=age;
	}
	public int getAge() {       //Getter used for getting the the or reading the No-Static variable Data.
		return age;
	}
}
