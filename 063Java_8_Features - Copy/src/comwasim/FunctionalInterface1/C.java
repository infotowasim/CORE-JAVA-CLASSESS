package comwasim.FunctionalInterface1;

//Functional Interface only Allow one Incomplete method.
//Functional Interface can allow any number of Complete method with default keyword or default method.
//Override should be happen because of Incomplete method convert to Complete method.
//@FunctionalInterface with this.
//Multiple Inheritance not applicable in Functional Interface.

public interface C extends A,B{

	public static void main(String[] args) {
		A a1=()->{
			System.out.println(100);
		};
		a1.test1();
//		a1.test2(); // Multiple Inheritance not applicable in Functional Interface.

	}

}
