package javasessions;

import java.util.Scanner;

public class PrintDLS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter any sentence which consists of numbers, spaces ,letters n symbols  ");
      String str = sc.nextLine();
      sc.close();
       char[] ch = str.toCharArray();
      
      int letters=0;
      int numbers=0;
      int spaces=0;
      int symbols=0;
      
      for(Character c:ch) {
    	   
    	  if(Character.isDigit(c)) {
    		  numbers++;
    	  }
    	  else if(Character.isLetter(c)){
    		  letters++;
    	  }
    	  else if(Character.isSpaceChar(c)){
    		  spaces++;
    	  }
    	  else {
    		  symbols++;
    	  }
    	  
      }
      
      System.out.println("Count of letters in given sentence:"+letters);
	  System.out.println("Count of spaces in given sentence:"+spaces);
	  System.out.println("Count of numbers in given sentence:"+numbers);
	  System.out.println("Count of symbols in given sentence:"+symbols);
	  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}  

}
