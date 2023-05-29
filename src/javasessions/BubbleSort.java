package javasessions;

import java.util.Arrays;

public class BubbleSort {
	
//	public static void printArray(int arr[]) {
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
//		System.out.println();
//	}


	public static void main(String[] args) {
		
		int arr[]= {1,3,3,4,2,6,9,1,7,5,6,8};
	
		//bubble sort
		for (int i=0; i<arr.length-1;i++) {       // counter
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];//swapping
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
			}
		System.out.println(Arrays.toString(arr));
//		printArray(arr);
		
	
    

}
}
