package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-z]");  //except a-z
		Matcher m = p.matcher("cv3456g@#$%vf#$gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
