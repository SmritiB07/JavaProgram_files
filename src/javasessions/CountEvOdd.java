package javasessions;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvOdd {

	public static void main(String[] args) {

//		System.out.println("=======COUNT no of EVEN and ODD digits in a given NUMBER==========");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any digit no");
//		int number = sc.nextInt();
//		sc.close();
//		int even = 0;
//		int odd = 0;
//
//		while (number != 0) {
//			int remainder = number % 10;
//			if (remainder % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//			number = number / 10;
//			
//		}
//		System.out.println("Count of even digits in a given no is:" + " " + even
//				+" & "+ "Count of odd digits in a given no is:" + " " + odd);

//		
//		System.out.println("=======Print even & Odd digits separately=========");
//		
//		int Array1[]= {3,4,5,6,1,7,8,9,10,15};
//		System.out.println("The below numbers are even no in the given array:");
//		for(int even:Array1) {
//			if(even%2==0) {
//				System.out.print(even+" ");
//			}
//			
//		}
//		System.out.println("");
//		System.out.println("The below numbers are odd no in the given array:");
//		for(int odd:Array1) {
//			if(odd%2!=0) {
//				System.out.print(odd+" ");
//			}
//			
//		}
//		
//		System.out.println("===========Random Number Generation============");
//		
//	    int range=100;
//		double random=Math.random();
//		System.out.println("Random number"+" :  "+(int)(random*range));
		
		//int is used to avoid decimal values
//		System.out.println("=========2D Array=======");
//		
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter rows and columns:");
//		int rows=sc.nextInt();
//		int cols=sc.nextInt();
//		sc.close();
//		int [][] Array1=new int[rows][cols];
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				Array1[i][j]=sc.nextInt();	
//			}
//		}
//	
//		System.out.println("Enter a no to be found:");
//		int x=sc.nextInt();
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				if(Array1[i][j]==x) {
//				System.out.println("Given no is found at:"+" "+i+"th row"+" & "+" "+j+"th col");	
//				}
//			}
//		}
		System.out.println("======Comparing arrays without inbuilt method=========");
		
//		int a[]= {0,2,3,5,6,8};
//		int b[]= {0,2,3,4,6,8};
		String a[]= {"Smriti","Priya"};
		String b[]= {"Smriti","Priyaa"};
		boolean status=true;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
					break;
				}
				
			}
		}else {
			status=false;
		}
		
		if(status) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays not equal");
		}
//		System.out.println("====Comparing arrays with inbuilt Method");
//		int a[]= {0,2,3,5,6,8};
//		int b[]= {0,2,3,5,7,8};
//		 if(Arrays.equals(a, b)) {
//			 System.out.println("arrays are equal");
//		 } else {
//			 System.out.println("arrays are not equal");
//		 }
//		
		System.out.println("=============Strings Comparision========");
		String str1="234";
		String str2="   237";
		if(str2.trim().compareToIgnoreCase(str1)==0) {
			System.out.println("Equal");
		}
		else {
			System.out.println("NotEqual");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
