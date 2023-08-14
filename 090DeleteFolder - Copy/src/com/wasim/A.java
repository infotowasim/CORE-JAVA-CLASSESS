package com.wasim;

//delete() method- it help us to delete the folder in given path.

import java.io.File;

public class A {

	public static void main(String[] args) {
		File file=new File("C://mithu69//t1");
		boolean delete = file.delete();
		System.out.println(delete);
	}
}
