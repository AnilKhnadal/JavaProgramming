package day5;

public class FindNumOfOpenAndCloseBracketInAString {

	public static void main(String[] args) {
		String str="(((()))))";
		int openBracket=0;
		int closeBracket=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='(')
			{
				openBracket++;
			}
			else if(str.charAt(i)==')')
			{
				closeBracket++;
			}
		}
		System.out.println("Number of OpenBracket : "+openBracket);
		System.out.println("Number of closeBracket : "+closeBracket);
	}
}
