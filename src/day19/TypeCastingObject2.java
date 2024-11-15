package day19;

// 	Cat ct=(Cat) an; // A B C D


class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObject2 {

	public static void main(String[] args) {
		
		// Rule 1 : Conversion valid or not
		// the type of 'D' and 'C' must have some relationship(either parent to child or child to paret 
	/*	Animal an=new Dog();
		Cat ct=(Cat) an; // this is valid as per rule 1
		*/
		
	/*	Dog dg=new Dog();
		Cat ct=(Cat) dg; // Invalid as per Rule 1
		*/
		
		// Rule 2 : assignment valid or not
		// 'C' must be either same or child of 'A'
		
	/*	Animal an=new Dog();
		Cat ct=(Cat) an; // valid as per Rule 2
		*/
		
	/*	Animal an=new Dog();
		Cat ct=(Dog) an; //  Invalid as per Rule 2
		*/
		
		// Rule 3 : the underlying object type 'd' must be same or child of 'C' 
		
	/*	Animal an=new Dog();
		Cat ct=(Cat) an; // ClassCastException (Rule 3 : runtime error) Dog and Cat no relationship(underlying)
	                    // Invalid as per Rule 3
		*/
		
		// Rule 1, Rule 2, Rule 3
		
		Animal an=new Dog();
		Dog dg=(Dog) an; // Rule 1 - yes  Rule 2 - yes Rule 3 - yes
	}
}
