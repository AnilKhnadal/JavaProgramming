package day3;

public class TernaryOperators {
	public static void main(String[] args) {
		
		// var=exp? result1 : result2;
		
		// Ex 1
	/*	int a=200, b=100;
		
		int x=(a>b)? a:b;
		System.out.println(x); // 200
		*/
		
		//Ex 2
		
	/*	int x=(1==1)? 100:200;
		System.out.println(x); // 100
		*/
		
	/*	int y=(1==2)? 100:200;
		System.out.println(y); // 200
		*/
		
		// Ex 3
		int person_age=30;
		String res=(person_age>=18)? "Eligible" : "Not-Eligible";
		System.out.println(res);
	}
}
