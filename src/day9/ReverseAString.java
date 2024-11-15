package day9;

public class ReverseAString {
         public static void main(String[] args) {
			
       // Approach 1 - length(), charAt()
        	
        	 
        /*	 String s="Anilkumar";
        	 String rev="";
        	for(int i=s.length()-1; i>=0; i--)
        	{
        		rev=rev+s.charAt(i);
        	}
        	System.out.println("Reverse String is : "+rev);
        	
        	*/
        	
     // Approach 2 - Without using string method or Converting String to char arra type
        	
        /*	String s="Khanadal";
        	String rev="";
        	
        	char a[]=s.toCharArray(); // Convert String to Chae=r array
        	for(int i=a.length-1; i>=0; i--)
        	{
        		rev=rev+a[i];
        	}
    		System.out.println("Reverse String is : "+rev);
              */
        	 
      // Approach 3 - Using StringBuffer class
        	 
        /*	 StringBuffer s=new StringBuffer("welcome");
         	 System.out.println("Reverse string is : "+s.reverse());
       
       */
       
     // Approach 3 - Using StringBuilder class 	
             StringBuilder s=new StringBuilder("welcome");
        	 System.out.println("Reverse string is : "+s.reverse());
		}
}
