package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
       int a[]= {10,20,30,40,50};
       int search_element=30;
       boolean status=false;   //false - not found  true - found
       
       /*for(int i=0; i<a.length; i++)
       {
    	   if(a[i]==search_element)
    	   {
    		   System.out.println("Element Found");
    		   status=true;
    		   break;
    	   }
    	   // Don't use else condition here
       }
       */
       
       for(int x:a) {
    	   if(x==search_element)
    	   {
    		   System.out.println("Element Found");
    		   status=true;
    		   break;
    	   }
       }
       if(status==false)
	   {
		   System.out.println("Element Not Found");
	   }
	}

}
