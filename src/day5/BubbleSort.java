package day5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,5,2,1,3};

// Approach 1
		System.out.println("Array Before Sortig : "+Arrays.toString(a));
		
		int n=a.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		} 
		
		System.out.println("After sorting array : "+Arrays.toString(a));
		
// Approach 2
		
		// Ascending order
/*		System.out.println("Array Before Sortig : "+Arrays.toString(a));
		Arrays.parallelSort(a); // Arrays.sort(a);
		
		System.out.println("After sorting array : "+Arrays.toString(a));
		
		// Decending order
		Integer b[]= {4,5,2,1,3};
		
		System.out.println("Array Before Sortig : "+Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("After sorting array : "+Arrays.toString(b));
		*/
	}
}
