package thisAndsuper;

public class SuperKeyword {

	SuperKeyword() {
		System.out.println("Animal constructor");
	}
}

class Dog extends SuperKeyword {
	Dog() {
		super(); // Calls the Animal constructor
		System.out.println("Dog constructor");
	}

	public static void main(String[] args) {
		Dog dog = new Dog(); // Calls both Animal and Dog constructors
	}
}
