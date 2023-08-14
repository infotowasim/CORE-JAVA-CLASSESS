
public class Finally1 {

	public static void main(String[] args) {
		
		try {
			int y=10/2;
			System.out.println(y); // it will run
		} catch (Exception e) {
			System.out.println(100); // not run 
		}finally {
			System.out.println(500); // definitely it will run
		}

	}

}
