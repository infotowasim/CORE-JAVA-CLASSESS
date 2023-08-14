package com.wasim.RunTimeArthmeticException;

//CompileTime Exception:- Its occur during compilation.
//its occur when dot java file is convert to dot class file.
//RuntimeTime Exception:- If Exception occur when run dot class file. 
//its occur during RunTime.

//Arithmetic Exception:- when Invalid mathematical operation is done then u get AE. for handling AE we use AE class.

public class A {

	public static void main(String[] args) {
		try {
			int x=10;
			int y=0;
			int z=x/y;//ArithmeticException
			System.out.println(100);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(300);
	}
}
