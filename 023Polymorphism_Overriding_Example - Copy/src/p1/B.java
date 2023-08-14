package p1;

public class B extends A{
	
	@Override              //Override Annotation use for verifying weather overriding is happen or not.
	                      //if override is not happening then we would get error.
	public void test1() {
		System.out.println(20);
	}

	public static void main(String[] args) {
		B b1= new B();
		System.out.println(b1.x);
		b1.test1();
		b1.test2();
	}
}
