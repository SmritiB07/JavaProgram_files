package javasessions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemDupFrAr {

	

	public static void main(String[] args) {
		int OrgAr[]= {11,12,12,7,3,4,3,5,8,5,4,6,7,9,6,10};//Array literal unsorted array
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<OrgAr.length;i++) {
			set.add(OrgAr[i]);
		}
//         Integer  NewAr[]=set.toArray(new Integer[set.size()]); //hash set into array
          Integer newArr[]=set.toArray(new Integer[set.size()]);      
        System.out.println(Arrays.toString(newArr));
     //   output:[3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
		//int OrgArr[]= {3,3,4,5,5,6,6,7,8,9,9};
		
		
	//	System.out.println("=====Finding duplicate element========");	
//	
      //  String OrgArr[]= {"Nidhi","Priya","Nidhi","Tiya","Tiya","Riya"};
//		
//		//HashSet<String> hset=new HashSet<String>();
//		Set<String> hset=new HashSet<String>();

//		for(int i=0;i<OrgArr.length;i++) {
//			if(hset.add(OrgArr[i])==false) {
//				System.out.println(OrgArr[i]+"is duplicated in the array at"+":"+i);
//				
//			}
//		}
//		hset.add(OrgArr[i]);
//		}
//		String n []=hset.toArray(new String[hset.size()] );
//		System.out.println(Arrays.toString(n));
			
			
//		
//		System.out.println("======Find count of digits in a number=========");
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any digit no:");
//		int digits=sc.nextInt();
//		sc.close();
//		int count=0;
//		
//		while(digits>0) {
//			digits=digits/10;
//			count++;
//		}
//		System.out.println("No of digits in the given number are:"+" "+count);
//	System.out.println("======= Prac======");	
	//int digit =1/10;==0
		//int digit =4%10;==4
		//System.out.println(digit);
//	System.out.println("Find who is duplicated in the array=====");	
//		int[] OrgArr= {3,4,5,3,6,7,7,1,8,9,10,8};
//		String []n= {"nidhi", "priya", "riya", "giya","priya", "nidhi"};
//		for(int i=0;i<n.length;i++) {
//			for(int j=i+1;j<n.length;j++) {
//				if(n[i]==n[j]) {
//					System.out.println(n[i]+" "+"is duplicated in the array");
//				}
//				
//			}
//		}
//		
//		System.out.println("=======Removing duplicates from sorted array========");
//		int[] OrgArr= {3,3,3,4,4,4,5,5,6,6,7,7,8,9};//sorted array
//		int j=0;
//		for(int i=0;i<OrgArr.length-1;i++) {
//			if(OrgArr[i]!=OrgArr[i+1]) {
//				
//				OrgArr[j]=OrgArr[i];
//				j++;	
//			}		
//		}
//		OrgArr[j]=OrgArr[OrgArr.length-1];
//		for(int k=0;k<=j;k++) {
//  System.out.print(OrgArr[k]+" ");			
//		}
        
//	System.out.println("======== Find duplicate characters and threir count========");	
//		Scanner sc=new Scanner(System.in);
//	       System.out.println("Enter a english statement");//my name is smriti
//	       String str = sc.nextLine();
//	       sc.close();
//	       char[] ch = str.toCharArray(); // for investigation we need characters so convert 
//	       
//	       
//	       Map<Character,Integer> m=new HashMap<Character,Integer>();
//	       
//	       for(Character c: ch) {
//	    	   if (m.containsKey(c)){
//	    		   m.put(c, m.get(c)+1);
//	    	   }
//	    	   else {
//	    		   m.put(c, 1);
//	    	   }
//	       }
//	       
//	       for(Character c:m.keySet()) {
//	    	  if(m.get(c)>1) {
//	    		  System.out.println("Character"+" "+ c+ " " +"is repeated"+" "+ m.get(c)+" " +"times");
//	    	  } 
//	       }
	       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
