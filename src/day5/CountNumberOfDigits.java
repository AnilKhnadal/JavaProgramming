package day5;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num=1245678;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits in a Number : "+count);
	}
}
