package dat2;

public class VariablesDemo {

	public static void main(String[] args) {
		int a; // declaration
		a = 100; // assign

		int b = 200; // declaration+assign

		System.out.println(a);
		System.out.println(b);

		a = 300;
		System.out.println(a);
		
		// Approach 1 - if all the variable belogs to defferent data types
	/*	int x=10;
		int y=20;
		int z=30;
		*/
		
		// Approach 2 - if all the variable belogs to same data types
	/*	int p,q,r;
		p=900;
		q=800;
		r=700;
		*/
		
		// Approach 3 - if all the variable belogs to same data types
		int m=100, n=200, o=300;	
		
		System.out.println("The value of m is : "+m);
		System.out.println("The value of n is : "+n);
		System.out.println("The value of o is : "+o);
		 
		System.out.println(m+" "+n+" "+o); // 100 200 300
	}
}
