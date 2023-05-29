package exceptionHandling;

public class Employee {
	String name="smriti";

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
//		
//		try {
//		int i=9/0;
//		System.out.println(i);
//		System.out.println("Error is coming....");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming....");
//		e.printStackTrace();	
//		}
//		System.out.println("bye");
		
		try {
//			Employee e=new Employee() ;
//			e=null;//this will create NPE
//			System.out.println(e.name);
			int i=9/0;	
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
			}
//	catch(ArithmeticException e)
		//catch(ArithmeticException e) it cannot handle null pointer exception
		/*
		 * catch(NullPointerException e){ //System.out.println("AE is coming....");
		 * System.out.println("NPE is coming....");
		 * 
		 * e.printStackTrace(); }
		 */
		//catch(Throwable e) //print bye 
		//exception is due to wrong code ,error is due to infrastructure issue
		catch(Error e){ //error cannot handle exception so bye will not be printed viceversa
			System.out.println("I am throwable....");			
			e.printStackTrace();
		}
		
		System.out.println("bye");
		
		
		
		
	}

}
