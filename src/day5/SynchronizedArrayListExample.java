package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> synchronizedList = Collections.synchronizedList(list);

		// Now you can safely use synchronizedList in multiple threads
		synchronizedList.add("Item 1");
		synchronizedList.add("Item 2");

		// Iterating over synchronized list
		synchronized (synchronizedList) {
			for (String item : synchronizedList) {
				System.out.println(item);
			}
		}
	}
}
