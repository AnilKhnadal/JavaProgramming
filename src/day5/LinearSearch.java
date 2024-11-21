package day5;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,30};
		
		int search_ele=50;
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Linear Element Found : "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
	}
}
