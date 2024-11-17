package day4;

// Smallest of three number (if.else)

//a<b && a<c (true) -- a is smallest
//b<a && b<c (true) -- b is smallest
//c<a && c<b (true) -- c is smallest

public class SmallestOf3Number {

	public static void main(String[] args) {
		
        int a=40, b=50, c=30;
		
     // Approach 1
        
        if(a<b && a<c)
		{
			System.out.println("a is a smallest number : "+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is a smallest number : "+b);
		}
		else
		{
			System.out.println("c is a smallest number : "+c);
		}
		
		
        // Approach 2
        // Find the smallest number
      /*  int smallest = Math.min(a, Math.min(b, c));
        
        // Output the result
        System.out.println("The smallest number is: " + smallest);
        */
	}
}
