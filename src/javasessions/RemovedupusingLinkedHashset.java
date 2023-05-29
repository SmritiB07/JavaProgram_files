package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovedupusingLinkedHashset {

	public static void main(String[] args) {
	/*
	ArrayList<String> value= new ArrayList<String>(Arrays.asList("riya","riya","veena","  riya  ","nusrat")); 
	
	//1.LinkedHashset
	//remove duplicate string using linkedHashset
	LinkedHashSet<String> lhs=new LinkedHashSet<String>(value);
	//for fresh arraylist after removal
	ArrayList<String> RemdupList=new ArrayList<String>(lhs);
	System.out.println(RemdupList);
  //cannot look for spaces
	*/
	//2.JDK 8- streams
	ArrayList<String> value= new ArrayList<String>(Arrays.asList("riya","riya","veena","riya","nusrat")); 
    List<String> uniqueEle=value.stream().distinct().collect(Collectors.toList());
    System.out.println(uniqueEle);
	
	
	
	
	
	
	
	
	
	
	}

}
