package OOP_Abstract;

public abstract class ClassPage {

	public ClassPage() {
		System.out.println("Class Page constructor.....");
	}
	
	public abstract void title();
	public abstract void url();
	public void loadingpage() {
		System.out.println("Loading page ....method");
	}
	public final void logo() {
		System.out.println("Logo is final type ... ");
	}
	public static void footer() {
		System.out.println("footer is a static method...parent abstract class");
	}
	 private void LoadHTML() {
		 System.out.println("ClassPage... LoadHTML");
	 }
	
}
