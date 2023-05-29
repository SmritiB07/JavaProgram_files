package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
	 
		//1.sort and then equals:
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("priya","riya","siya","charu"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("priya","riya","Siya","charu"));

		Collections.sort(l1);
		Collections.sort(l2);

		//System.out.println(l1==l2);
		//System.out.println(l2);
		//sorts in order as  capital first and small later
		
		//Find out the additional element:
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("priya","riya","siya","charu"));
		ArrayList<String> l5= new ArrayList<String>(Arrays.asList("priya","  riya  ","Siya","Jiya"));
//        l4.removeAll(l5);// whatever common btwn l4 &l5 is removed from l4
//        System.out.println(l4);
//        System.out.println(l5);
        
        //3. Find out missing elements:
//        l5.removeAll(l4);
//        System.out.println(l5);
       l4.retainAll(l5); 
       System.out.println(l4);//whatever common btwn l4 &l5 is retained 
        


	}

}
