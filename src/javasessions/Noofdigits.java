package javasessions;

import java.util.Scanner;

public class Noofdigits {
	
	public static void main(String[] args) {
		int count=0;
		int rem=0;
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter any number from which no of digits to be verified");
	int Number=sc.nextInt();
	while(Number!=0) {
		
		
		rem=Number%10;
		count++;
		Number=Number/10;

	}
	System.out.println("No of digits in a given Number is:"+ +count);

	sc.close();
     
	}

}
