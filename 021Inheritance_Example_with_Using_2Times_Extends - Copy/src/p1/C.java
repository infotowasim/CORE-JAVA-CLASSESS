package p1;

public class C extends B{
	
	public void test3() {
		System.out.println(10000);
	}

	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1.x); //10
		c1.test();                //100
		c1.test2();               //1000
		c1.test3();               //10000
	}

}
