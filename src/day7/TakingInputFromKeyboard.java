package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	  public static void main(String[] args) {
		  
//		int num=20; // hard coded value
		  
		 Scanner scan=new Scanner(System.in);
		 
		/*  System.out.println("Enter a number :");
		  int num = scan.nextInt();
		  System.out.println("Given numbere is :" +num);
		  */
		 
    	/*	System.out.println("Enter Decimal number : ");
		 double num = scan.nextDouble();
		 System.out.println("Given number is : "+num);
		 */
		 
		 System.out.println("Enter City Name : ");
		 String String = scan.next();
		 System.out.println("Your City is : "+String);
	}
}
