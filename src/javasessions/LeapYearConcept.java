package javasessions;

import java.util.Scanner;

public class LeapYearConcept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		boolean isLeapYear=false;
		if(year%4==0) {
			
			if(year%100==0) {
				
				if(year%400==0) {
					isLeapYear=true;
				}
				else 
					isLeapYear=false;
				
			}
			else 
				isLeapYear=true;
			
		}
		else 
			isLeapYear=false;
		
		
		
		if(isLeapYear) {
           System.out.println("Yes, given year:"+year+" "+ "is a leap year");			
		}
		else {
			System.out.println("No,given year:"+year+"is not a leap year");
		}
		
		sc.close();
	}
	
	
	
	
	
//	System.out.println("============Print Date and Time========");
//	
//	      Date date=new Date();
//		System.out.println(date);
	
	
	
	

}
