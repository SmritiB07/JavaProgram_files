package OOP_Abstract;

public class Loginpage extends ClassPage {

	@Override
	public void title() {
		System.out.println("This is loginpage title ");
		
	}
	public void Loadapp() {
		LoadHTML();
	}

	@Override
	public void url() {
		System.out.println("This is loginPage URL");	
	}
//	@Override
//	public void loadingpage() {
//		System.out.println("Child class Loading page ....method");
//	}
	
	public static void footer() {
		System.out.println("footer is a static method...child class");
	}
	
	 private void LoadHTML() {
		 System.out.println("LoginPage... LoadHTML");
	 }
	 //individual
	public void dologin(String username, String pwd) {
		System.out.println("Username and password is :"+" "+username+" : "+pwd);
	}
	
	

}
