package javasessions;

import java.util.Scanner;

public class PrintFactorial {

//	public static int printfact(int num) {
//	if (num==0|| num==1) {
//		return 1;
//	}
//	int fact_nm1=printfact(num-1);
//	int fact_n=num*fact_nm1;
//	return fact_n;
//	}
	
	public static int findFactorial(int a) {
		if(a==0|| a==1) {
			return 1;
		}
		else 
			return a*findFactorial(a-1);		 
	}
	public static void main(String[] args) {
//	int n=6;
//	int factorial=printfact(n);
//	System.out.println("factorial of a no:"+factorial);

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		sc.close();
		int fact=findFactorial(n);
		System.out.println(fact);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
      
	}

}
