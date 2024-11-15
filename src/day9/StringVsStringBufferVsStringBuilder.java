package day9;

public class StringVsStringBufferVsStringBuilder {
   public static void main(String[] args) {
	
	   // String -- immutable, cannot change
	 /*  
	   String s="welcome";
	   s.concat("to jave");
	   System.out.println(s); // immutable cannot change original value of s
	   */
	   
	  // StringBuffer -- mutable, can change
	 /*  
	   StringBuffer s=new StringBuffer("welcome");
	   s.append(" to jave");
	   System.out.println(s); // welcome to jave,  mutable, we can change original value of s
	  */  
	   
	  // StringBuilder -- mutable, can change
	   StringBuilder s=new StringBuilder("welcome");
	   s.append(" to jave");
	   System.out.println(s); // welcome to jave,  mutable, we can change original value of s
}
}

// String dont have append method
// concat is use only in string
//append is used in StringBuffer and StringBuilder

