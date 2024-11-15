package day6;

/*
1) Declare an array
2) Add value in to array
3) Find size of an array
4) Read single value from an array
5) Read multiple value from an array 
 */

public class SingleDimensionalArray {
   public static void main(String[] args) {
	
// Declaring array
	//Approach
	   
	   /*  int a[]=new int[5];
	   a[0]=100;
	   a[1]=200;
	   a[2]=300;
	   a[3]=400;
	   a[4]=500;
	   */
	   
	//Approach
	   
        int a[]= {100,200,300,400,500};
        
//Find length of an array
        
        System.out.println("Lenght of an array = "+(a.length));
	   
//Read single value from an array
        
        System.out.println(a[4]);//500 here 4 is index
        System.out.println();
        
//Reading all the value from array
        
        //Normal For loop
       
       /* for(int i=0; i<=4; i++)   // i<=4 , i<5, i<=a.lenght-1, i<a.lenght
        {
        	System.out.println(a[i]);
        }
        */
        
        //Enhanced for loop/for..each loop
        
        for(int x:a)
        {
        	System.out.println(x); //100 200 300 400 500
        }
    }
}
