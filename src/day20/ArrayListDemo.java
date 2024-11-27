package day20;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		ArrayList<Object> mylist = new ArrayList<Object>();
		// List myslist=new ArrayList(); //child class object hold in th eparent class
		// object
		// ArrayList<Integer> mylist=new ArrayList<Integer>(); //Only homogenious data
		// stored <wrapper class only>
		// ArrayList<Employee> mylist=new ArrayList<Employee>(); // Employee objects
		// only stored

		// Adding data in ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		// size of an array
		System.out.println("Size of an array list : " + mylist.size()); // 8

		// Printing arraylist
		System.out.println("Printing data from arraylist : " + mylist); // [100, 10.5, welcome, A, true, 100, null,
																		// null]

		// Remove elements from arraylist
		mylist.remove(5); // 5 is a index of element
		// after remove from arraylist
		System.out.println("Printing data from arraylist : " + mylist); // [100, 10.5, welcome, A, true, null, null]

		// Insert element in the arraylist
		mylist.add(200); // [100, 10.5, Java, welcome, A, true, null, null, 200]
		mylist.add(2, "Java"); // Insertion 2 index jave - value
		System.out.println("after insertion : " + mylist); // [100, 10.5, Java, welcome, A, true, null, null]

		// modify element in the arraylist (modify/replace/change)
		mylist.set(2, "Python"); // 2 index
		System.out.println("After replacing : " + mylist); // [100, 10.5, Java, Python, A, true, null, null, 200] - Jave
															// replaced Python

		// Access specific element from arraylist
		Object obj = mylist.get(3); // 3 index
		System.out.println(obj); // welcome

		// Reading all element from array list
		// using normal for loop

		/*
		 * for(int i=0; i<mylist.size();i++) { System.out.println(mylist.get(i)); }
		 */

		// using for..each loop

		/*
		 * for(Object x:mylist) { System.out.println(x); }
		 */

		// using iterator (used only collection)

		Iterator it = mylist.iterator();
		// System.out.println(it.next());// it will print only first array only, so
		// thats why we are using hasNext method.

		/*
		 * while(it.hasNext()) // we dont know the how many object present in the array
		 * (if it is true) { System.out.println(it.next()); }
		 */

		// checking arraylist empty or not

		System.out.println("Is arraylist empty? " + mylist.isEmpty()); // false

		// remove all the elements from the array list

		ArrayList<Object> mylist2 = new ArrayList<Object>();

		mylist2.add(100);
		mylist2.add("welcome");
		mylist2.add(200);

		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements : " + mylist); // [10.5, Python, A, true, null, null]

		// remove all elements clear
		mylist.clear();
		System.out.println("Is arraylist empty? : " + mylist.isEmpty()); // true
	}
}
