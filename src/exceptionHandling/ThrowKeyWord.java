package exceptionHandling;

public class ThrowKeyWord {

	public static void getInfo() {
		try {
			throw new Exception("DATANOTFOUNTEXCEPTION");
		}
		catch(Exception e) {
			System.out.println("data not found for this user.....");
			e.printStackTrace();
		}
		System.out.println("bye");
		
	}
	
	public static void main(String[] args) {
//		try {
//			throw new Exception("DATANOTFOUNTEXCEPTION");
//		}
//		catch(Exception e) {
//			System.out.println("data not found for this user.....");
//			e.printStackTrace();
//		}
//		System.out.println("bye");
		getInfo();

	}

}
