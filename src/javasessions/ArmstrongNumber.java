package javasessions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three digit no:");
		
		int num=sc.nextInt();
		sc.close();
		int originalnum=num;
		int cubednum=0;
		
//Logic to check whether given no is armstrong or not
		while(num>0) {
			
			int remainder=num%10;
			cubednum=cubednum+(remainder*remainder*remainder);
			num=num/10;
		}
		
		if(originalnum==cubednum) {
		System.out.println("Yes,Input no. is armstrong num");	
		}
		else {
			System.out.println("No,it is not an armstrong no");
		}
		
		
		
		
		
	}

}
// 153=1*1*1+5*5*5+3*3*3