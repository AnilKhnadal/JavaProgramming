package day3;

public class OperatorsDemo {

	public static void main(String[] args) {

		// 1) Arithmetic operators + - * / %

		int a = 20, b = 10;

		System.out.println("Sum of a and b : " + (a + b)); // 30
		System.out.println("Diff of a and b : " + (a - b)); // 10
		System.out.println("Multiplication of a and b : " + (a * b)); // 200
		System.out.println("Division of a and b : " + (a / b)); // 2 Qutionts
		System.out.println("Modulo division of a and b : " + (a % b)); // 0 Remider

		// 2) Relational/comparison operators > >= < <= != ==
		// It return boolean value
		// It will work between Two variables

		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(a >= b); // true
		System.out.println(a <= b); // false
		b = 20;
		System.out.println(a <= b); // true b=20 chamged
		System.out.println(a >= b); // true b=20 chamged
		System.out.println(a != b); // false b=20 chamged
		System.out.println(a == b); // true b=20 chamged

		boolean res = a > b;
		System.out.println(res); // false

		// 3) Logical operators && || !
		// It return boolean value
		// It will work only two boolean values

		boolean x = true;
		boolean y = false;

		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		System.out.println(!y); // true

		boolean b1 = 10 > 20;
		System.out.println(b1); // false

		boolean b2 = 20 > 10;
		System.out.println(b2); // true

		System.out.println(b1 && b2); // false
		System.out.println(b1 || b2); // true

		System.out.println((10 < 20) && (20 > 10));
	}
}
