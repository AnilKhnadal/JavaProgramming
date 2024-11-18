package day5;

public class WhleVsDoWhileLoop {

	public static void main(String[] args) {
		
	/*	int i=1;
		while(i<=5)
		{
			System.out.println(i); //  if condition not setisfied it will not print anything
			i++;
		}
		*/
		
	int i = 10;

	do {
		System.out.println(i);  // if condition not setisfied at list once round print
		i++;
	} while (i <= 5);
}
}
