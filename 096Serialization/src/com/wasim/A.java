package com.wasim;

//Serialization - In serialization we can convert objects 0's and 1's . then you can store the object state into a file system.
//it help us to store object state permanently into the file.
//FileOutputStream - its a special file, which can return 0's & 1's. we can create file or object.
//u have to close FileOutputStream using fileOutputStream.close()method.

import java.io.Serializable;

public class A implements Serializable{

	String name="Wasim";
	String city="Bangalore";
	

}
