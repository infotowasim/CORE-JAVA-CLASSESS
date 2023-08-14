package comwasim.FunctionalInterface;

//Functional Interface only Allow one Incomplete method.
//Functional Interface can allow any number of Complete method with default keyword or default method.
//Override should be happen because of Incomplete method convert to Complete method.
//@FunctionalInterface with this.
//Multiple Inheritance not applicable in Functional Interface.

@FunctionalInterface
public interface A {
	public void test();
	
	default void test1() {
		System.out.println(900);
	}
	default void test2() {
		System.out.println(800);
	}
	default void test3() {
		System.out.println(700);
	}
	default void test4() {
		System.out.println(600);
	}
}
