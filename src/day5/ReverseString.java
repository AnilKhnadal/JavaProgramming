package day5;

public class ReverseString {

	public static void main(String[] args) {
		
		// Using + (string concatenation) operator
		
		String str="ABCD";
		String rev="";
		
		int len = str.length(); // 4
		
		for(int i=len-1; i>=0; i--) // 3 2 1 0 -1
		{
			rev=rev+str.charAt(i); // DCBA
		}
		System.out.println("Reverse String is : "+rev);
		
		// Using character array
		
	/*	char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1; i>=0; i--) // 3 2 1 0 -1
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is : " +rev);
		*/
		
		// Using StringBuffer class
		
	/*	StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println("Reverse String is : " + reverse);
		*/
	}
}
