package javasessions;

import java.util.*;

public class LinkedListConcept {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
     list.addFirst("a");
     list.addFirst("is");
     System.out.println(list);
     list.addFirst("LinkedList");
     list.addLast("LIST");
     System.out.println(list);
     System.out.println(list.size());
//     for(int i=0;i<list.size();i++) {
//    	 if(list.get(i)=="a") {
//    		 break;
//    	 }
//    	 System.out.print(list.get(i)+"-->");
//    	
//     }
   //  System.out.println("Null");
    list.remove(0);
       System.out.println(list);
     
	}

}
