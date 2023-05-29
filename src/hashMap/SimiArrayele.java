package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SimiArrayele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array 1 elements");
		int no1=sc.nextInt();
		int a1[]=new int[no1];
		for (int i=0;i<a1.length;i++) {		
	  System.out.println("Enter array elements");
			a1[i]=sc.nextInt();
			
		}
		System.out.println("Enter array 2 elements");
		int no2=sc.nextInt();
		int a2[]=new int[no2];
		for (int i=0;i<a2.length;i++) {
			System.out.println("Enter array 2 elements");
			a2[i]=sc.nextInt();		
		}
		/*
		HashMap<Integer,Integer> fmap=new HashMap<>();
		for(int val:a1) {
			if(fmap.containsKey(val)) {
				int of=fmap.get(val);
				int nf=of+1;
				fmap.put(val,nf);
			}
		}
		*/
		
		
		
		
		

	}

}
