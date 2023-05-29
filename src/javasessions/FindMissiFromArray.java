package javasessions;

import java.util.Arrays;

public class FindMissiFromArray {

	public static void main(String[] args) {

//		System.out.println("==========Find Missing No from Array==========");
//		
//		int a[]= {1,2,3,4,6,8};
		
//		int sumwithoutMissing=0;	
//		int	sumwithMissing=0;
		
//		for(int i=0;i<=8;i++) {
//			sumwithoutMissing=sumwithoutMissing+i;
//			
//		}
//		
//		for(int m:a) {
//		sumwithMissing=sumwithMissing+m;
//			
//		}
		
//		System.out.println("Missing Element :"+" "+(sumwithoutMissing-sumwithMissing));
		
		System.out.println("==========Find Max and Min in the array");
		
		int a[]= {8,1,2,4,5,16,12,15,18,19,13,11,10};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
		 if(max < a[i]) {
			 max=a[i];
		 }
		 if(min > a[i]) {
             min=a[i];			 
		 }
		}
		
		System.out.println("Max no in the array:"+" "+max);
		System.out.println("Min no in the array:"+" "+min);
		
//		System.out.println("========Searching element from Array==========");
//		int a[]= {2,3,6,7,5,8,9};
//		int serachNum=10;
//		boolean found=false;
//		for(int i=0;i<a.length;i++) {
//           if(serachNum==a[i]) {
//        	   found=true;
//        	   System.out.println("Element is found on index:"+" "+i);
//        	   break;
//           }			
//		}
//		if(!found) {
//			System.out.println("element is not found!");
//		}
		
		
		
//
//		System.out.println("======== Sort Array with inbuilt method=======");
//	int a[]= {18,4,43,233,33,89,99,199,150,298,50,26};
//	System.out.println("Before sorting:"+Arrays.toString(a));
//	Arrays.parallelSort(a);
//	System.out.println("After sorting with inbuilt function:"+Arrays.toString(a));
//	
//		
		
		
		
//	System.out.println("=======Remove spaces and other junks from string======");
//	
//	String str="!@#!@323 &*() ACGH*%kgt $^()";
//	
//		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
//		
//		System.out.println(str1);
	// cap is used to say not from them rest everything should be replaced	
		
		
		
		
		
	System.out.println("======= Find No of occurances of letter==========");
	String str="Smriti Bhandari";
	int before=str.length();
	int after=str.replace("i", "").length();
	
	System.out.println("No. of occurances of letter: a "+" "+(before-after));	
		
		
		
		
		
		
		
		
		
		
		
	}

}
