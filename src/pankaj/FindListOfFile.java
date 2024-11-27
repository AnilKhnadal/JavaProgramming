package pankaj;

import java.io.File;

public class FindListOfFile {

	public static void main(String[] args) {
		
		File fl=new File("E:\\Pawar Sir Java Videos");
		String[] lst = fl.list();
		
		for(String s: lst)
		System.out.println(s); // All list will be diplay here
		
		System.out.println(lst.length); // Number of file present in list
	}
}
