package day5;

public class MaxAndMinValueInArray {

	public static void main(String[] args) 
	{
		int a[] = { 50, 30, 40, 20, 60, 100, 0};
		int max = a[0]; // consider

		// . Max value
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The max vlue of array : " + max);

		// Min value
		int min = a[0]; // consider
		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min value of array :" + min);
	}
}
