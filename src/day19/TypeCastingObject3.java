package day19;

// A b=(C) d;


public class TypeCastingObject3 {

	public static void main(String[] args) {
		
		// Example 1
	/*	Object o=new String("welcome");
		StringBuffer sb=(StringBuffer) o; // Rule1 - yes Rule2 - yes Rule3 - failed 
		*/
		
		//Example 2
	/*	String s=new String("welcome");
		StringBuffer sb=(StringBuffer) s; // Rule1 - failed 
		*/
		
		//Example 3
	/*	Object o=new String("welcome");
		StringBuffer sb=(StringBuffer) o; // Rule1 - yes Rule2 - yes Rule3 - failed
		*/
		
		//Example 4
	/*	Object o=new String("welcome");
		StringBuffer sb=(String) o; // Rule1 - yes Rule2 - failed 
		*/
		
		//Example 5
	/*	String s=new String("welcome");
		StringBuffer sb=(String) s; //Rule1 - yes Rule2- failed
		*/
		
	/*	//Example 6
		Object o=new String("Welcom");
		StringBuffer sb=(StringBuffer) o; // Rule1- yes Rule2- yes Rule3- failed
		*/
		
		//Example 7
		Object o=new String("welcome");
		String s=(String) o; // Rule1- yes Rule2 - yes Rule3- yes
		
		System.out.println(s);
		}
}
