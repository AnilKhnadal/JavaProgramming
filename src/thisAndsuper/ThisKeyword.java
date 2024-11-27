package thisAndsuper;

public class ThisKeyword {

	int x, y;

	// Constructor 1
	ThisKeyword() {
		this(10, 20); // Calls Constructor 2
	}

	// Constructor 2
	ThisKeyword(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x = " + x + ", y = " + y);
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(); // Calls Constructor 1
	}
}
