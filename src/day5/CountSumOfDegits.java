package day5;

public class CountSumOfDegits {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10; //4+3+2+1
			num=num/10; // 123 12 1 0
		}
		System.out.println("Sum of Digits in a number : "+sum);
	}
}
