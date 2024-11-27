package day4;

//num>0 positive
//num<0 Negative
//num=0 Zero
public class PositiveOrNegativeNumber {

	// num>0 positive
	// num<0 Negative
	// num=0 Zero

	public static void main(String[] args) {

		int num = -200;

		if (num > 0) {
			System.out.println("Positive number");
		} else if (num < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("zero");
		}
	}
}
