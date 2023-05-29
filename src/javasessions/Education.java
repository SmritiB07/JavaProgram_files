package javasessions;

public class Education {
int students;
String prayer;
 public Education(int students) {
	 this.students=students;
	 System.out.println(" parameterized constructor first ");
 }
 public Education(int students, String prayer) {
	 this.students=students;
	 this.prayer=prayer;
	 System.out.println("parameterized constructor second ");
 }


	public static void main(String[] args) {
     // Education obj= new Education();
      Education obj2=new Education(100, "Tum hi ho mata");
       Education obj= new Education(200);

      
      System.out.println("In a school of: "+" "+ obj.students+" "+"we sing"+obj2.prayer);
	}

}
