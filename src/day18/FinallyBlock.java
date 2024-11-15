package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch (NumberFormatException e) 
		{
			System.out.println("catch block handeled exception..");
			System.out.println(e.getMessage());		
		}
		finally 
		{
			System.out.println("you are entered into finally block...");
		}
		
		System.out.println("Program finished...");
	}
}
