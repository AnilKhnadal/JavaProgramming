package day5;

// 5!=1*2*3*4*5=120
public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=5; 
		long factorial=1;
		
	/*	for(int i=1; i<=num; i++)     // 1*2*3*4*5
		{
			factorial=factorial*i;
		}
		*/
		
		for(int i=num; i>=1; i--)     // 5*4*3*2*1
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of a Number is : "+factorial);
	}
}
