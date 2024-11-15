package day7;

import java.util.Scanner;


public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
	/*	Ex : 1
		System.out.println("Enter First Number : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Addition of 2 numbers : "+(num1+num2));
	*/
	
		//	Ex : 2
		
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Your name is : "+name);
		
		System.out.println("Enter your age is : ");
		int age = scan.nextInt();
		System.out.println("Your age is : "+age);
		
		System.out.println("Enter unknown value : ");
		Object value = scan.next();
		System.out.println(value );
		
	}
}
