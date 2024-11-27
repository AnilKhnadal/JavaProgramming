package arrayToArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// Creating an ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(2);
		// Convert ArrayList to Array
		Object[] array = arr.toArray();
		// Printing the Array
		for (Object ar : array)
			System.out.println(ar + " ");
	}

	}





