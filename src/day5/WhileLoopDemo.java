package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
// Example 1: print 1....10 numbers
		
		/*int i=1; //initialization
		while(i<=10)   // condition
		{
			System.out.println(i);
			i++;     // inc/dec
		}*/
		
// Example 2: Print Hello message 10 times
		
		/*int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}*/
		
// Example 3: Print even number b/w 1 to 10
 // Approch 1
		
		/*int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2; // i=i+2	
		} */
		
 // Approch 2
		
		/*int i=1;
		while(i<=10) 
		{
			if(i%2==0) {
			System.out.println(i);
			}	
			i++;
		}*/
		
// Example 4: 1.......4
		
	/*	1 odd
		2 even
		3 odd
		4 even
		.
		.
		10 even */
		
		/*int i=1;
		while(i<=10) 
		{
			if(i%2==0) 
			{
			System.out.println(i + " Even");
			}	
			else
			{
			System.out.println(i + " Odd");
			}
			i++;
	
	}*/
		
// Example 5: print 10.........1
		
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}

}
}
