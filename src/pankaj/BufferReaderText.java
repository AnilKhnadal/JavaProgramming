package pankaj;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderText {

	public static void main(String[] args) {
		String filePath="E://Pawar Sir Java Videos//JAVA//Day 0-Java.txt";
		
	
		try {
			FileReader fl=new FileReader(filePath);
			BufferedReader br=new BufferedReader(fl);
			
			for(int i=0; i<3; i++)  // 3 lines
			{
				String string = br.readLine();
				System.out.println(string);
			}
			
		} catch (Exception e) {
		}
	}
}
