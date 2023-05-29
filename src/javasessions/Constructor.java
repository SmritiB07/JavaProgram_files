package javasessions;

public class Constructor {
	
	String name;
	int age;
	
	public Constructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	

	public static void main(String[] args) {
	
   Constructor obj= new Constructor("Smriti",28);
   
   System.out.println(obj.name+" "+obj.age);
   
   
	}

}
