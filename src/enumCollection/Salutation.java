package enumCollection;

/* enum is a special class type that represents a group of constants 
(unchangeable variables, like final variables).
Ex : Month list, Day list etc
*/
public class Salutation {

	public enum Salut {
		Mr, Mrs, Dr, Prof
	}
	
	public static void main(String[] args) {
		
		System.out.println(Salut.Dr);
	}
}
