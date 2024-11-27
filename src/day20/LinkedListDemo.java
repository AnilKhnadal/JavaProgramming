package day20;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// Add elements to the end
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// Add element at the beginning
		list.addFirst("Mango");
		list.addLast("Pradeep");
		System.out.println(list);

		System.out.println("Element at index 1: " + list.get(1));

		list.removeFirst();
		System.out.println("Remote the First data : " + list);

		System.out.println("Print All elements: " + list);

		System.out.println("Array size : " + list.size());

		// Add data in perticuler index
		list.add(1, "Bendi");
		System.out.println(list);

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Anil");
		lst.add("Kumar");
		System.out.println("Print All elements: " + lst);

		list.addAll(2, lst);

		System.out.println("list & lst combile :" + list);

		String data = list.get(3);
		System.out.println("Index 3 element : " + data);
		System.out.println("peek : " + list.peekFirst());
		System.out.println("remove : " + list.remove()); // Only First element will display
	}
}
