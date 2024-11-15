package day7;

import java.util.Arrays;

public class SortingElementInArray {
   public static void main(String[] args) {
	
	   int a[]= {100,600,200,400,500};
	   System.out.println("Before sorting.....");
      System.out.println(Arrays.toString(a)); // [100, 600, 200, 400, 500]
    /*  for(int value:a)
      {
    	  System.out.println(value);
      }
	   */
      Arrays.sort(a); //Sorts elements in an array 
      System.out.println("After sorting.....");
      System.out.println(Arrays.toString(a));
   }
}
