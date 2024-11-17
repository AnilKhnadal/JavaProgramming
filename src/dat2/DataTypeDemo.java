package dat2;

public class DataTypeDemo {

	public static void main(String[] args) {
		// Numeric data type
		int a=100, b=200;
		System.out.println("the value of a is : "+a);
		System.out.println("the value of b is : "+b);
		System.out.println("the sum of value a & b is : "+(a+b));
		
		byte c=125;
		System.out.println(c);
		
		short d=3535;
		System.out.println(d);
		
		long l=6546544645646L;  // literal needed L/l
		System.out.println(l);
		
		// Decimal numbers - float Double
		float item_num=10.555F;  // literal needed F/f
		System.out.println(item_num);
		
		double db=1235.6545645646;
		System.out.println(db);
		
		char grad= 'A';
		System.out.println(grad);
		
		String name="Anil";
		System.out.println(name);
		
//		char ch='ABC'; // invalid
//		String ch= 'ABC'; // invalid
//		String ch= 'A'; // invalid
		String ch= "A";
		
		boolean bl=true; // allows only true/false
		System.out.println(bl);
		
		
		
	}
}
