package javasessions;

import java.util.Scanner;

public class WAPEvenandOdd {
	
	
	public static void findEvenOdd(int input) {
		if(input%2==0) {
			System.out.println("input num is : even"+"  "+(input/2));	
		}
		else {
			System.out.println("No is odd");
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int inputnum=sc.nextInt();
		findEvenOdd(inputnum);
		sc.close();
		
		

	}

}
