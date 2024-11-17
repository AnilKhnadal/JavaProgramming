package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		
//		4) Decrement --
		
			// Case 1
		/*	int a=10;
			System.out.println(a); // 10
			
			a--;      // a=a+1
			System.out.println(a); // 9
			*/
			
			// Case 2
		/*	int a=10;
			int res=a--; // Post Decrement operator
			System.out.println(res); // 10
			System.out.println(a); // 9
			*/
			
			// case 3
			int a=10;
			int res=--a; // pre-decrement operator
			System.out.println(res); // 9
			System.out.println(a); // 9
	}
}
