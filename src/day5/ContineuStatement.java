package day5;

public class ContineuStatement {
   public static void main(String[] args) {
	
	 //Example 1 : Skip 5
	   
/*	for(int i=1; i<=10; i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i); //1 2 3 4 6 7 8 9 10
   }
	*/
	
	//Example 2: Skip 3 5 and 9
	   
			for(int i=1; i<=10; i++) {
				if(i==3 || i==5 || i==9) {
					continue;
				}
				System.out.println(i); //1 2 3 4
		   }
}
}
