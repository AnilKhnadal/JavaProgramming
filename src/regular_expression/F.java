package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\S"); // Except space index will display
		Matcher m = p.matcher("cv 3456 g@# $%v f# $gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
