package day6;

public class ObjectArray {
	//Herirogenios data
	
  public static void main(String[] args) {
	
	  Object a[]= {100,10.5,'A',"WELCOME",true};
	  
	/*  for(Object x:a)
	  {
		  System.out.println(x);
	  }
	  */
	  
	  for(int i=0; i<a.length; i++)
	  {
		  System.out.println(a[i]);
	  }
   }
}
