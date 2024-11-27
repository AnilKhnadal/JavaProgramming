package arrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// Creating an Array
		Integer[] array = { 1, 2, 3 };

		// Convert Array to ArrayList
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

		// Printing the ArrayList
		for (int i : list) {
			System.out.println(i);
		}
	}
}
