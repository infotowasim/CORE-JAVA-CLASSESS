package p1;

//Here, A & B are non sub classes & there is no Inheritance happening b/w them. 

public class B {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x); //10
		a1.test();                //100
	}

}
