package day5;

/* Prime Number
  1) Natural num >1
  2) Divisible by 1 and itself only (Two factors only)
  3) 3 5 7 11 13 etc - Prime number
  4) 1 2 4 6 8 8 10 etc - Not a prime number
  */
public class PrimeNumber {

	public static void main(String[] args) {

		int num = 17;
		int count = 0; // factors

		if (num > 1) 
		{
            for(int i=1; i<=num; i++)
            {
            	if(num%i==0)
            		count++;
            }
            if(count==2)
            {
            	System.out.println("Prime number");
            }
            else
            {
            	System.out.println("Not a prime number");
            }
		} 
		else 
		{
           System.out.println("Nit a Prime number");
		}
	}
}
