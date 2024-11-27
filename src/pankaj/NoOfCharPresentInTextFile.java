package pankaj;

import java.io.File;

public class NoOfCharPresentInTextFile {

	public static void main(String[] args) {
		
		String filePath="E://Pawar Sir Java Videos//JAVA//Day 0-Java.txt";
		
		File fl=new File(filePath);
		long len = fl.length();
		System.out.println(len);
	}
}
