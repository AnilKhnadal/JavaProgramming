package day5;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Java programming language";
		
		int len = s.length(); // total length of string
		int after_rem_a_len = s.replaceAll("a", "").length(); // After Removing the Length of string
		
		int count=len-after_rem_a_len;
		System.out.println("Number Occurance a is : "+count);
	}
}
