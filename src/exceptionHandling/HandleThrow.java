package exceptionHandling;

public class HandleThrow {
	
	public static void checkAge(int Age) {
		if(Age<18) {
			throw new ArithmeticException("Access is denied: You must be older then 18"); 
		}
		else {
			System.out.println("Access granted : You can access");
		}
	}

	public static void main(String[] args) {
		checkAge(19);

	}

}
