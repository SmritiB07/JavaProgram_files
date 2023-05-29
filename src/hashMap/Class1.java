package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class1 {

	//noorder, no indexing
	//stores values-- key values<k,v>
	//key cannot be duplicate
	//can store n number of null values but only one null key
	//hashmap is not thread safe, unsynchronised
	//to make it synchronised , we willl use synchronised map , concurrent hashmap 
	public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("smriti",97);
	hm.put("Asmit",98);
	hm.put("Ismriti",90);
	hm.put("shrii",98);
	hm.put("iti",94);
	hm.put("smar",0);
	
	//System.out.println(hm);  //{smriti=97, Ismriti=90, shrii=98, smar=0, Asmit=98, iti=94}
	/*
	System.out.println(hm.get("smar"));
	System.out.println(hm.get("shrii"));
	System.out.println(hm.get("shreya"));
	System.out.println(hm);
	
	System.out.println(hm.containsKey("Ismriti"));
	System.out.println(hm.containsKey("Isha"));
	
	if(hm.containsKey("iti")) {
		System.out.println("pass");
	}	
	else {
		System.out.println("fail");
	}
	
	
	for(Map.Entry<String, Integer> e:hm.entrySet()) {
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		System.out.println(e);

	}
	/*
	smriti=97
	Ismriti=90
			shrii=98
			smar=0
			Asmit=98
			iti=94
	
	
	Set<String> s=hm.keySet();
	for(String key:s) {
		System.out.println(key+" "+hm.get(key));
	}
	
	smriti 97
	Ismriti 90
	shrii 98
	smar 0
	Asmit 98
	iti 94
     */
	//iterator:Over the keys using keySet------1
	/*
	Iterator<String> it=hm.keySet().iterator();
	while(it.hasNext()) {
		String key=it.next();
		Integer value=hm.get(key);
		System.out.println("key for a hashmap is:"+key+" ,"+"value is:"+value);
	}
	*/
	
	//iterator : over the set(pair) by using entry set-----2s
	
	Iterator<Entry<String, Integer>> it1 = hm.entrySet().iterator();
	while(it1.hasNext()) {
		Entry<String, Integer> entry = it1.next();
		System.out.println(entry);	
	}
	System.out.println("---------------------");
	//iterate using java 8 for each and lambda
	hm.forEach((k,v)->System.out.println("key ="+k+ " and  "+"value ="+v));
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
