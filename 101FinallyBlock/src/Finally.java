
//Finally Block:- Finally block is a extension of try-catch.
//Regardless of whether exception happened or not finally block definitely run.
public class Finally {

	public static void main(String[] args) {
		
		try {
			int x=10/0;
			System.out.println(x); // not run 
			
		} catch (Exception e) {
			System.out.println(100); // it should be run 
			
		}finally {
			System.out.println(500); // definitely it will run
			
		}
		

	}

}

