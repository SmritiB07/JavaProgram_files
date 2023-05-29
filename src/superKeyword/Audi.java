package superKeyword;

public class Audi extends Car {
 
	//variable
	int speed=120;
	//constructor
	public Audi() {
		super.refuel();;
	
		System.out.println("Audi constructor......");
	}
	@Override
	public void start() {
		super.start();
		super.refuel();
		System.out.println("Audi ------ start");
	
		super.refuel();
		
	}
	//individual
	public void getspeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}
	
	
	
}
