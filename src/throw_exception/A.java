package throw_exception;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		 int balance=500;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the amount......");
		 int amount = sc.nextInt();
		 if(amount==balance)
		 {
			 System.out.println("Please collect the amount...");
		 }
		 else
		 {
			 try {
				throw new InsufficientFunds();
			} catch (InsufficientFunds e) {
				System.out.println("Low Balance....");

			}
		 }
	}
}
