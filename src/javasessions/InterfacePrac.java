package javasessions;

public interface InterfacePrac {

	
	public void  animal();
	default void vehicle() {
		System.out.println("default method for vehicle:With default we can define interface methods");
	}
	static void car() {
		System.out.println("Static Methods:With interface, We can define interface methods from inetface Prac  ");
	}
	
	
	
	
}
