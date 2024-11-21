package day6;

/*
1) Declare an array
2) Add value in to array
3) Find size of an array
4) Read single value from an array
5) Read multiple value from an array 
 */

public class TwoDimensionalArray {
    public static void main(String[] args) {
		//Declaration array
    	
    	//Approch1
    	
    /*	int a[][]=new int[3][2];
    	
    	a[0][0]=100;
    	a[0][1]=200;
    	
    	a[1][0]=300;
    	a[1][1]=400;
    	
    	a[2][0]=500;
    	a[2][2]=600;
    	*/
    	
    	//Approch2
    	
    	int a[][]= {{100,200},{300,400},{500,600}};
    	
//Find length of an array
        
        System.out.println("Lenght of Rows = "+(a.length));
        System.out.println("Lenght of Columns = "+(a[0].length));
        
//Read single value from an array
       // System.out.println(a[2][1]);
        
 //Reading all the value from array
        
        //Normal for loop
     /* for(int r=0; r<=2; r++)     // r<=a.lenght-1
        {
        	for(int c=0; c<=1; c++)  c<=a[r].lenght-1
        	{
        		System.out.print(a[r][c]+" ");
        	}
        	    System.out.println();
        }
       */
        
      //Enhanced for loop/for..each loop
        
        for(int arr[]:a)
        {
        	for(int x:arr)
        	{
       		System.out.print(x + " ");
        	}
        	System.out.println();
        }
	}
}
