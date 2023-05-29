package javasessions;

import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
		
   String a[][]=new String [2][2];
   Scanner sc =new Scanner (System.in);
   System.out.println("Enter values in strings:");
  
   
   for (int i=0;i<2;i++) {
	   for(int j=0;j<2;j++) {
		   a[i][j]=sc.nextLine();
	   }
   }
  

   System.out.println("Enter name to be found");
   String x=sc.nextLine();
   for (int i=0;i<3;i++) {
	   for(int j=0;j<4;j++) {
		   if(a[i][j]==x) {
			   System.out.println("names found at:["+i+"]["+j+"] ");
			   
		   }
//System.out.println("   name["+i+"]["+j+"]   = "+a[i][j]);
	   }
   }
   sc.close();
   
   
   
   
   
   
   
	}

}
