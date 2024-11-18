package day5;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		// Approach - 1
		
		Random rand=new Random();
	/*	int rand_int = rand.nextInt(10); // Range 0 to 9
		System.out.println(rand_int);
		*/
		
		double rand_dbl = rand.nextDouble(); //range0.0 to 1.0
		System.out.println(rand_dbl);
	}
}
