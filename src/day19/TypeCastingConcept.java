package day19;

//Upcasting - Converting value frop smaller --> larger
// int --> long
//float --> double

//Downcasting - Converting value frop larger --> smaller
// long --> int
//double -->float


public class TypeCastingConcept {

	public static void main(String[] args) {
		
		// Upcasting -automatic -- smaller to larger
	/*	int intvaule=100;
		long longvalue=intvaule;
		System.out.println(longvalue);
		*/
		
	/*	float floatvalue=10.5F;
		double doublvalue=floatvalue;
		System.out.println(doublvalue);
		*/
		
		//downcasting - manually -larger to smaller
		
	/*	long longvalue=100000;
		int intvalue=(int)longvalue;
		System.out.println(intvalue);
		*/
		
	/*	double doublevalue=125.55;
		float floatvalue=(float)doublevalue;
		System.out.println(floatvalue);
		*/
		
		//Example 1
		
	/*	int i=100;
		double d=i; // upcasting
		System.out.println(d); // 100.0
		*/

		//Example 2
		
		double d=10.5;
		int i=(int)d; // // downcasting
		System.out.println(i); // 10 decimal part terminated
		
		
		
	}
}
