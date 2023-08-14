package comwasim.FunctionalInterface;

//Functional Interface only Allow one Incomplete method.
//Functional Interface can allow any number of Complete method with default keyword or default method.
//Override should be happen because of Incomplete method convert to Complete method.
////Multiple Inheritance not applicable in Functional Interface.

public class B implements A{
	
	@Override
	public void test() {
		System.out.println(500);	
	}

	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		b1.test1();
		b1.test2();
		b1.test3();
		b1.test4();
	}
}
