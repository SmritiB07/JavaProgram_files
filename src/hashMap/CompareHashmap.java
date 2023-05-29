package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(1,"A");
		hm1.put(3,"C");
		hm1.put(2,"B");
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(2,"B");
		hm2.put(3,"C");
		hm2.put(1,"A");
		hm2.put(4,"D");

		HashMap<Integer,String> hm3=new HashMap<Integer,String>();
		hm3.put(1,"A");
		hm3.put(2,"B");
		hm3.put(3,"D");
		hm3.put(3,"C");

		
		//1.On the basis of key-value use equals method
		System.out.println(hm1.equals(hm3));
		System.out.println(hm2.equals(hm1));
		
		//2.Compare hashmaps for same keys:keyset()
		
		System.out.println(hm1.keySet().equals(hm3.keySet()));
		
		//3.Find out missing key or extra key from hashmap
		HashMap<Integer,String> hm4=new HashMap<Integer,String>();
		hm4.put(2,"B");
		hm4.put(3,"C");
		hm4.put(1,"A");
		hm4.put(4,"D");
		
		HashSet<Integer> combinedKeys=new HashSet<>(hm1.keySet());
		combinedKeys.addAll(hm4.keySet());
		combinedKeys.removeAll(hm1.keySet());
		System.out.println(combinedKeys);// combined keys has that extra key so print that
		
		//4. compare by values
		
		
		
		
		
		
		

	}

}
