package day16;
 
interface Shape
{
	int lenght=10; // final & static
	int width=20; // final & static
	
	void circle(); // abstract method
	
	default void square()
	{
		System.out.println("this is square - default method...");
	}
	
	static void rectangle()
	{
		System.out.println("this is rectangle - static method...");
	}
}
public class InterfaceDemo implements Shape {

	public void circle()
	{
		System.out.println("this is circle - abstract method...");
	}
	
	void triangle()
	{
		System.out.println("this is triangle...");
	}
	
	int x=100, y=100;
	public static void main(String[] args) {
		
		// Scenario - 1
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle(); // abstract
		idobj.square(); // default
		Shape.rectangle(); // static method can directly access from interface
	    idobj.triangle();
	    System.out.println(idobj.x+idobj.y); // 30
	    
		// Scenario - 2
		Shape sh=new InterfaceDemo();
		
		sh.circle(); // abstract
		sh.square(); // default
		Shape.rectangle(); // static method can directly access from interface
		
		// sh.triangle();// error - we cannot access 
		// System.out.println(sh.x+sh.y); // error - x and y variable not belongs to Shape class
	    
	    System.out.println(Shape.lenght*Shape.width); // accessing static variable directly
	}
}
