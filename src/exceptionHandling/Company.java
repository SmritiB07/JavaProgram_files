package exceptionHandling;

public class Company {
	public void m1() {
		System.out.println(" this m1 method");
		m2();
	}

	public void m2() {
		System.out.println(" this m2 method");
		try{
			m3();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}
	public void m3() throws ArithmeticException {
		System.out.println(" this m3 method");
		int i=9/0;
		}

//	public void m3() {
//		System.out.println(" this m3 method");
//		try{
//			int i=9/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		}
//		}
	

	public static void main(String[] args) {
		Company co = new Company();
		co.m1();
        System.out.println("bye");
	}

}
