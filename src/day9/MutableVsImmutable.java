package day9;

import java.util.Arrays;

public class MutableVsImmutable {
     public static void main(String[] args) {
    	 
    	// mutable can change
    	 
		int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //Changing array Mutable
		System.out.println(Arrays.toString(a));
		
		//immutable   //Strings are immutable
		
		
		String s=new String("welcome");
		
		System.out.println(s);  //welcome
		String concat = s.concat(" to jave");
		
	    System.out.println(s); // welcome --immutable cannot change
	    System.out.println(concat);// welcome to jave
	}
}
