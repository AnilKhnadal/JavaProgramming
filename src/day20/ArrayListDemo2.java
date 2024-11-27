package day20;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// Create an ArrayList of String type
		ArrayList<String> list = new ArrayList<>();

		// Add elements to the ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		// Print the ArrayList
		System.out.println("ArrayList: " + list);

		// Access an element
		System.out.println("Element at index 1: " + list.get(1));

		// Modify an element
		list.set(1, "Mango");
		System.out.println("Updated ArrayList: " + list);

		// Remove an element
		list.remove("Orange");
		System.out.println("After removal: " + list);

		// Get the size of the ArrayList
		System.out.println("Size of ArrayList: " + list.size());

		// Check if the list contains a specific element
		System.out.println("List contains 'Apple': " + list.contains("Apple"));
	}
}
