package day12;

// Method overloading
public class Adder {

	int a=10, b=20;
	
	void sum()   // 1
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)  // 2
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y) // 3
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)  //4
	{
		System.out.println(x+y);
	}
}
