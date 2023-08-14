package comwasim.DefaultKeyword;

//Default keyword or method only can be created complete method inside Interface.
//U can create any number of Default method inside interface.
//This feature was introduced in java version 8.

public class B implements A{

	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		b1.test1();
		b1.test2();
		b1.test3();
	}
}
