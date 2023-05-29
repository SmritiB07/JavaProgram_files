package javasessions;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no:");
	int num= sc.nextInt();
	sc.close();
	int originalnum=num;
	int remainder=0;
	int dicing=0;
    while(num!=0) {
    	remainder=num%10;
    	dicing=(dicing*10)+remainder;
    	num=num/10;
    	
    }
	if(originalnum==dicing) {
		System.out.println("Yes, Input no. is Palindrome");		
	}
	else {
		System.out.println("No,Input is not palindrome");
	}
	
//131: palindrome no
//	Scanner sc=new Scanner(System.in);
//    System.out.println("Enter any string:");
//	String org=sc.nextLine();
//	System.out.println("String before reversing:"+org);
//	String reverse="";
//	
//	for(int i=0;i<org.length();i++) {
//		reverse=org.charAt(i)+reverse;
//	}
//	System.out.println("String after reversal:"+" "+reverse);
//	sc.close();
	
	//leet code solution:
	/*
	public boolean isPalindrome(int x) {
		   
	    int reverse=0;
	    int dup=x;
	     
	     while(x>0){
	      reverse=reverse*10+(x%10);
	      x/=10;
	     }
	        if(reverse==dup){
	            return true;
	        }
	        else
	        return false;
	    }
	*/
	
	
	
	
	
	
	
	
	}

}
