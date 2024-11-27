package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d"); // Digit index will display
		Matcher m = p.matcher("cv6g@33#$%v8f#52$gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
