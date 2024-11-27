package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		// HashMap hm=new HashMap();
		// Map hm=new HashMap(); // Map is a parent class of HashMap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "Anil");
		hm.put(102, "Kumar");
		hm.put(103, "Khanadal");
		hm.put(104, "Dubalgundi");
		hm.put(105, "Bidar");
		hm.put(102, "Humnabad"); // Duplicate value replaced with new value
		System.out.println(hm); // {101=Anil, 102=Humnabad, 103=Khanadal, 104=Dubalgundi, 105=Bidar}
		
		System.out.println("Size of hashmap : "+hm.size()); // Size of hashmap : 5
		
		// Remove pair
		
		hm.remove(103); // 103 key of the pair
		System.out.println("After removing the pair : "+hm); // {101=Anil, 102=Humnabad, 104=Dubalgundi, 105=Bidar}
		
		// access value of the key
		hm.get(102); // 102 is a key
		System.out.println(hm.get(102)); // Humnabad
		
		// get all the key from hashmap
		System.out.println(hm.keySet()); // [101, 102, 104, 105]
		System.out.println(hm.values()); // [Anil, Humnabad, Dubalgundi, Bidar]
        System.out.println(hm.entrySet()); // keys with value // [101=Anil, 102=Humnabad, 104=Dubalgundi, 105=Bidar]
  
        // Reading data from hashmap
        //Using for..each
        for(int k:hm.keySet())
        {
        	System.out.println(k+" "+hm.get(k));
        }

        // using Itetator
        Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
        while(it.hasNext())
        {
        	Entry<Integer, String> entry = it.next();
        	System.out.println(entry.getKey()+"  "+entry.getValue());
        }
		
		// clear
        hm.clear();
        System.out.println(hm.isEmpty()); // true
	}
}


















