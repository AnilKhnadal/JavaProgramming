package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\D"); // Except digit index will diplay 
		Matcher m = p.matcher("cv6g@33#$%v8f#52$gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
