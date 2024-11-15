package day19;

class Parent
{
	String name="Anil";
	
	void m1()
	{
		System.out.println("this is m1 from OParent...");
	}
}

class Child extends Parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 fro child...");
	}
}
public class TypeCastingObject1 {

	public static void main(String[] args) {
		
	/*	Child c=new Child(); 
		System.out.println(c.name ); // parent
		c.m1(); // parent
		System.out.println(c.id); // child
		c.m2();
		*/
		
	/*	Parent p=new Child(); // upcasting
		System.out.println(p.name ); // parent
		p.m1(); // parent
		System.out.println(p.id); // we cannot access
		p.m2(); // // we cannot access
		*/
		
		/*
		Child c=(Child) new Parent(); // or
		*/
		
		
		//downcasting
		Parent p=new Parent();  // ClassCastException
		Child c=(Child) p;
		System.out.println(c.name ); 
		c.m1(); 
		System.out.println(c.id); 
		c.m2(); 
		
		
	}
}
