package day15;

public class Animal {

	String color="White";
	
	void eat()
	{
		System.out.println("eatig.....");
	}
}

class Dog extends Animal
{
	String color="Black";
	
	void display()
	{
		System.out.println(color); // Black
		System.out.println(super.color); // White
	}
	
	void eat()
	{
		System.out.println("eatig bread....."); // eatig bread.....
		super.eat(); // eatig.....
	}
}
