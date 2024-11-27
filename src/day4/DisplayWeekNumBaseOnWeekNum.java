package day4;

public class DisplayWeekNumBaseOnWeekNum {

	public static void main(String[] args) {

		int weekNo = 1;

		if (weekNo == 1) {
			System.out.println("Sunday");
		} else if (weekNo == 2) {
			System.out.println("Monday");
		} else if (weekNo == 3) {
			System.out.println("Tuesday");
		} else if (weekNo == 4) {
			System.out.println("Wednesday");
		} else if (weekNo == 5) {
			System.out.println("Thursday");
		} else if (weekNo == 6) {
			System.out.println("Friday");
		} else if (weekNo == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid week Number");
		}
	}
}
