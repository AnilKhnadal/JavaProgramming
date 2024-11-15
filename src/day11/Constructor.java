package day11;

public class Constructor {

	int x;
	int y;
	
	Constructor() // default constructor
	{
		x=100;
		y=200;
	}
	
	Constructor(int a, int b) // parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Constructor cd1=new Constructor(); //invoke default constructor
		Constructor cd2=new Constructor(10,20); // parameterized constructor
		cd1.sum();
		cd2.sum();
	}
	
}
