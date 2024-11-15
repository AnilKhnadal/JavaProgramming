package day14;

class A 
{
	int a;
	void display() 
	{
		System.out.println(a);
	}
}

class B extends A       // single inheritance
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B      // multi level (grandchild of A class)
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}
public class InheritanceTypes {

	public static void main(String[] args) {
		
	/*	B bobj=new B();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();
		*/
	C bobj=new C();
	bobj.a=100;
	bobj.b=200;
	bobj.c=300;
	
	bobj.display();
	bobj.show();
	bobj.print();
	}
}
