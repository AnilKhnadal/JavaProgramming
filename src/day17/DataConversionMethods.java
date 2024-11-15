package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		//String --> int
		
		//String s="welcome"; // cannot convert to int
		
	/*	String s1="654"; 
		int sint = Integer.parseInt(s1);
		System.out.println(sint); //654
		String s2="10";
		String s3="20";
		System.out.println(Integer.parseInt(s2)+Integer.parseInt(s3)); // 30
		*/
	  
		//String --> double
		
	/*	String s2="10.32";
		String s3="20.56";
		System.out.println(Double.parseDouble(s2)+Double.parseDouble(s3));
		*/
		
		//String --> boolean
   /*	String s="true"; // other than trgue, false if you pass any string that will return  
		boolean bool = Boolean.parseBoolean(s);
		System.out.println(bool);
		*/
		
		// int,double,boolen,char --> String
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s = String.valueOf(a);
		System.out.println(s);
		
		String d1=String.valueOf(d);
		System.out.println(d1);
		
		String c1=String.valueOf(c);
		System.out.println(c1);
		
		String b1=String.valueOf(bool);
		System.out.println(b1);
		
	}
}
