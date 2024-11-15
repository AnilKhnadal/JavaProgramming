package day14;

public class PassingParamsToMainMethod {

	public static void main(String args[]) {
		
		System.out.println(args.length);
		
		for(String value:args)
		{
			
			System.out.println(value);
		}
	}
}
