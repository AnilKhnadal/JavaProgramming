package pankaj;

import java.io.File;
import java.io.FileReader;

public class ReadTheFileUsingFileReader {

	public static void main(String[] args) {

		String filePath = "E://Pawar Sir Java Videos//JAVA//Day 0-Java.txt";

		File fl=new File(filePath);
		try {
			FileReader fr = new FileReader(filePath);

			for(int i=0; i<fl.length(); i++)
			{
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
