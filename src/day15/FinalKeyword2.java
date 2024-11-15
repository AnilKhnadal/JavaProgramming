package day15;

final class Test1
{
	final void m()
	{
		System.out.println("this is method from test1...");
	}
}

class Test2 extends Test1 // incorrect, bcoz Test1 is a final class
{
	void m() // incorrect, bcoz m() is finalmethod
	{
		System.out.println("this is method from test2...");
	}
	
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		
	}
}
