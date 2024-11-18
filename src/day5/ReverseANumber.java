package day5;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
        int num = sc.nextInt();
		// 1) Using algorithm
    /*	int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		} */
		
	/*	StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/
        
        // Using StringBuilder class
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
		System.out.println("Reverse Number is : "+rev);
		
	}
}
