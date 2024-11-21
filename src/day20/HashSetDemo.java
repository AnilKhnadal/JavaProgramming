package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration
		
		 HashSet myset=new HashSet();
		// Set myset=new HashSet(); // Set is a parent class object
		// HashSet<String> myset=new HashSet<String>();
		
		// adding elemets in to hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100); // // duplicate
		myset.add(null);
		myset.add(null); // duplicate
		
		// printing hashset
		System.out.println(myset); // [null, A, 100, 10.5, welcome, true]
		
		// Removing element
		myset.remove(10.5); // 10.5 is a value not a Index
		
		System.out.println(myset); // [null, A, 100, welcome, true]
		
		// Insertion element - Not possible 
		// Access specific element - Not possible
		
		//convert HashSet--> ArrayList
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al); // [null, A, 100, welcome, true]
		System.out.println(al.get(2));// 2 is a Index 100
		
		// For normal for loop we cannot user bcoz Insertion not allowed
		// Read all the elements using for..each	
		
     /*	for(Object x:myset)
	   {
		System.out.println(x); 
	   }
		*/
		
		// Using Iterator
		
	/*	Iterator<Object> it=myset.iterator();
		
		while(it.hasNext())
		{
           System.out.println(it.next());
		}
		*/
		
		// Clearing all the elements in hashset
		
	/*	myset.clear();
		System.out.println(myset.isEmpty()); // true
		*/
		
		// size of hahset
		
		System.out.println("Size of HahSet : "+myset.size());
		
		
		
		
	}
}
