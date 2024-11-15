package day13;

public class ThisKeyword {
    
	int x,y; // class variables/instance variables
	
	/*	ThisKeyword(int x, int y) // (int a, int b)
	{
		this.x=x;   // x=a; this.x == class  variable
		this.y=y;  // y=b;
	} */
	
	void SetData(int x, int y)  // (int a, int b)
	{
		this.x=x; // x=a;
		this.y=y; // y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
		
	public static void main(String[] args) {
		
		// ThisKeyword th=new ThisKeyword(100,200);
		// th.display();
		
		ThisKeyword th=new ThisKeyword();
		th.SetData(200, 300);
		th.display();
		
	}
}
