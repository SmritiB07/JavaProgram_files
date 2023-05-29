package javasessions;

import java.util.Scanner;

public class FindNumberIsPrime {
	   		
	public static void main(String[] args){

//		int temp=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter any no to check wether it is prime or not:");
//		int n=sc.nextInt();
//		sc.close();
//		for (int i=2;i<=n-1;i++) {
//			if(n%i==0) {
//				temp++;
//				}
//		}
//		if(temp==0) {
//			System.out.println("given no is a prime no");
//		}
//		else {
//			System.out.println("given no is not a prime no");
//		}
			
		Scanner sc=new Scanner(System.in);
		int a, b, i,j,flag;
		System.out.println("Enter lower no:");
		a=sc.nextInt();//enter range
		System.out.println("Enter higher no:");
	    b=sc.nextInt();
	    System.out.println("Print prime no from a and b:");
	    for(i=a;i<=b;i++) {
	    	if(i==0||i==1) {
	    		continue;
	    	}
	    	flag=1;
	    	for(j=2;j<=i/2;j++) {
	    		if(i%j==0) {
	    			flag=0;
	    			break;
	    		}
	    		
	    		}
	    	if (flag==1) {
	    		System.out.println(i);
	    	}
	    }
		

		
		
		
		
		
		
		
	     }
	 }

	

