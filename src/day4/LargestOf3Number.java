package day4;

// a>b && a>c (true) -- a is largest
// b>a && b>c (true) -- b is largest
// c>a && c>b (true) -- c is largest

public class LargestOf3Number {

	public static void main(String[] args) {
		
		int a=100, b=20, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number :"+ a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number :"+ b);
		}
		else
		{
			System.out.println("c is largest number :"+ c);
		}
	}
}
