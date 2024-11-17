package day4;

public class LargestOfTwoNum {

	public static void main(String[] args) {
		int a = 40, b = 20;
     
        // Using if-else to find the largest number
     /*  if (a >= b) {
            System.out.println("a is Largest number : "+a);
        } else {
        	System.out.println("b Largest number : "+b);
        }
        
        */
        
      // Use ternary operator to find the largest number
        int largest = (a >= b) ? a : b;

        // Output the result
        System.out.println("The largest number is: " + largest);
    }
	}
