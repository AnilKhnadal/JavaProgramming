package day5;

public class PrintTriangleStar {

	public static void main(String[] args) {

		int rows = 5; // Number of rows in the triangle

		// Outer loop for each row
		for (int i = 1; i <= rows; i++) {
			// Inner loop to print stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // Print a star
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}
