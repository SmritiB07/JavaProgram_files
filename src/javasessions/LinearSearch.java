package javasessions;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,50,30,40};
		int i=Arrays.binarySearch(a, 50);
		System.out.println("Required no is avaialable at index:"+" "+i+" "+"on position of given array"+' '+(i+1));
	
		
//		int search_ele=60;
//		boolean flag=false;
//		for (int i=0;i<a.length;i++) {
//			if(a[i]==search_ele) {
//				System.out.println("element is present at"+" "+i);
//				flag=true;
//			break;	
//			}
//			//System.out.println(a[i]);
//		
//		}
//		if(flag==false)
//		System.out.println("element not found");
	}

}
