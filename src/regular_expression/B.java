package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-z]"); // [0-9] or [A-Z] or[a-zA-Z0-9]
		Matcher m = p.matcher("cv3456g@#$%vf#$gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
