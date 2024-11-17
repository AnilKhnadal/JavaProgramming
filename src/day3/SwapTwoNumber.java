package day3;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
	    // 1) Logic1 - Third variable
	/*	System.out.println("Before Swapping value are... :"+a+" ")+b;
		int temp;
		temp=a; // temp=10
		a=b;    // a=20
		b=temp; // b=10
		System.out.println("After Swapping a value is :"+a);
		System.out.println("After Swapping b value is :"+b);
		*/
		
		// Logic2 - use + and - without using third variable
	    
	/*	a=a+b; // 10+20=30
		b=a-b; // 30-20=10
		a=a-b; // 30-10=20
		System.out.println("After swapping a value :"+a);
		System.out.println("After swapping b value :"+b);
		*/
		
		// Logic3 - use * and / without using third variable
		
	/*	a=a*b; // 10*20=200
		b=a/b; // 200/20=10
		a=a/b; // 200/10=20
		System.out.println("After swapping a value :"+a);
		System.out.println("After swapping b value :"+b);
		*/
		
		// Logic4 - bitwise XOR (^)
	/*	a=a^b; // 10^20=30
		b=a^b; // 30^20=10
		a=a^b; // 30^10=20
		System.out.println("After swapping a value :"+a);
		System.out.println("After swapping b value :"+b);
		*/
		
		// Logic5 - Single statement
		b=a+b-(a=b);
		System.out.println("After swapping a value :"+a);
		System.out.println("After swapping b value :"+b);
	}
	
}
