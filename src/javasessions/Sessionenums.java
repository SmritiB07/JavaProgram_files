package javasessions;

   enum Level{
	 LOW,
	 HIGH,
	 MEDIUM
   }
	
   public class Sessionenums{
   public static void main(String[]args) {
	  Level myVar= Level.HIGH;
	  switch (myVar) {
	  case LOW:
		  System.out.println("Level is: LOW");
		  break;
	  case MEDIUM:
		  System.out.println("Level is: Medium");
		  break;  
	  case HIGH:
		  System.out.println("Level is: HIGH");
		  break;  
		  
		  
		  
	  }
	  
	  
	  
   } 
	
	
	
	
}
