package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		
	//	4) Increment ++
		
		// Case 1
	/*	int a=10;
		System.out.println(a); // 10
		
		a++;      // a=a+1
		System.out.println(a); // 11
		*/
		
		// Case 2
	/*	int a=10;
		int res=a++; // post increment operator
		System.out.println(res); // 10
		System.out.println(a); // 11
		*/
		
		// case 3
		int a=10;
		int res=++a; // pre-increment operator
		System.out.println(res); // 11
		System.out.println(a); // 11
	}
}
