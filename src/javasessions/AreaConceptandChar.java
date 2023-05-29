package javasessions;

import java.util.Scanner;

public class AreaConceptandChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//System.out.println("enter radius for circle: ");
		
//		double rad=sc.nextDouble();
//		
//	   System.out.println("Area of a circle for given radius:"+(Math.PI*rad*rad));

//		System.out.println("enter any character: ");
//		 boolean isVowel = false;
//		
//	   char c=sc.next().charAt(0);
//	   switch(c){
//	   case('a'):
//	   case('e'):
//	   case('i'):
//	   case('o'):
//	   case('u'):
//	   case('A'):
//	   case('E'):
//	   case('O'):
//	   case('I'):
//	   case('U'): isVowel = true;
//	   sc.close();
//	   }
//  
//
//	   if(isVowel) {
//		   System.out.println("Yes, char entered is vowel");
//	   }
//	   else {
//		   System.out.println("No, char entered is not vowel");
//	   }
	  System.out.println("enter any word:"); 
	  char ch=sc.next().charAt(1);
	  boolean isVowel=false;
	  
	   switch(ch) {
	   case('a'):
	   case('e'):
	   case('i'):
	   case('o'):
	   case('u'):
	   case('A'):
	   case('E'):
	   case('I'):
	   case('O'):
	   case('U'):isVowel=true;
	   
	   
	   }
	   
	   if(isVowel) {
		   System.out.println("2nd char is vowel:"+" "+ch);
	   }
	   else { 
	   System.out.println("2nd char is not a vowel:"+" "+ch);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
