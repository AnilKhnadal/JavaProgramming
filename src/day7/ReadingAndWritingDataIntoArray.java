package day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {
   public static void main(String[] args) {
	
	   int a[]=new int[5];
	   
	   Scanner scan=new Scanner(System.in);
	   for(int i=0; i<a.length; i++) 
	   {
		 System.out.println("Enter a value for the posotion "+i+":");  
		  a[i] = scan.nextInt();
	   }
	   
	   System.out.println("Printing Array Elements...........");
	   System.out.println(Arrays.toString(a));
}
}
