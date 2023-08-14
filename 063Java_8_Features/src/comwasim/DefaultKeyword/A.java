package comwasim.DefaultKeyword;

//Default keyword or method only can be created complete method inside Interface.
//U can create any number of Default method inside interface.
//This feature was introduced in java version 8. 

public interface A {
	
	default void test() {
		System.out.println(100);
	}
	default void test1() {
		System.out.println(200);
	}
	default void test2() {
		System.out.println(300);
	}
	default void test3() {
		System.out.println(400);
	}
}
