package day12;

public class BoxMain {
   
	public static void main(String[] args) {
		
		Box b1=new Box();
		b1.volume();
		System.out.println(b1.volume());
	    
		Box b2=new Box(10.5,20.5,30.5);
		b2.volume();
		System.out.println(b2.volume());
		
		Box b3=new Box(15.5);
		b3.volume();
		System.out.println(b3.volume());
	}
}
