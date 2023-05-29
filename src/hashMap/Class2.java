package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Class2 {
// a b r a a  c  a d a b r a a
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		sc.close();
    char []ch=str.toCharArray();//array literals
    Map<Character,Integer> hm=new HashMap<Character,Integer>();
    for(Character c:ch) {
    	if(hm.containsKey(c)) {
    		hm.put(c,hm.get(c)+1);
    	}
    	else {
    		hm.put(c, 1);
    	}	
    }
        for(Character c:hm.keySet()) {
        	if(hm.get(c)>3) {
        		System.out.println("charcter is:"+c+" "+hm.get(c)+" "+"times");
        	}
        }

     
	}

}
