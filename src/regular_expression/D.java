package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[0-9]{3}");
		Matcher m = p.matcher("9902432327");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
