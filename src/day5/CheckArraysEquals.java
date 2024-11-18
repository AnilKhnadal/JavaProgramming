package day5;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		
		
		boolean status = Arrays.equals(a1, a2);
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}
