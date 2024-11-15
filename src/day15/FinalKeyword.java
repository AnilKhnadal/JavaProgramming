package day15;

class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.x=200;  // incorrect, bcoz x is a final variable
		System.out.println(t.x);
	}
}
