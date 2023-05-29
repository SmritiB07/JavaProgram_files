package javasessions;

public class ClassPrac implements InterfacePrac {

	

	@Override
	public void animal() {
		System.out.println(" I am interface method implemented in class");	
	}
	//individual method
	public void traffic() {
		System.out.println("I am traffic...");
	}
	//methodhiding
	static void car() {
		System.out.println("Static Methods:With interface, We can define interface methods from class prac ");
	}
	
	
	
	

}
