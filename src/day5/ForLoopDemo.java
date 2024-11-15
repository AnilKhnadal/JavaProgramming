package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
//Example 1 : 1..........10
		
		/*for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		*/
		
//Example 2 : 1.........10 even Numbers	
		
//		for(int i=2; i<=10; i+=2)
//		{
//			System.out.println(i);
//		}
		
/* Example 3: 1....Odd
               2....even
                .
                .
                .
              10...even */

	/*	for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
			System.out.println(i + " Even");
			}
			else
			{
			System.out.println(i + " Odd");
			}
		}
		*/
		
//Example 4: 10......1 
		
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}
		
	}
}

