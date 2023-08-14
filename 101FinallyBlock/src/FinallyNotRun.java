
//How to forcefully stop finally block from running :- Using System.exit(0)method.

public class FinallyNotRun {

	public static void main(String[] args) {
		
		try {
			int z=10/2;
			System.out.println(z);
			
		} catch (Exception e) {
			System.out.println(100);
		}finally {
			System.exit(0); // it will not run 
			System.out.println(200);
		}
		

	}

}

