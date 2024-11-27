package pankaj;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWritter {

	public static void main(String[] args) {
		
		String filePath="E://Pawar Sir Java Videos//JAVA//Day 0-Java.txt";
		
		try {
			
			FileWriter fr=new FileWriter(filePath);
			BufferedWriter br=new BufferedWriter(fr);
			br.write("Anilkumar s/o Nagappa Khanadal\n");
			br.write("Dubalgundi");
			br.newLine(); // or \n
			br.write("Humnabad");
			br.close();
			System.out.println("BufferWritter Succesfully ");
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
