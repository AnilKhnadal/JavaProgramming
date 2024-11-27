package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s"); // Space index wil display
		Matcher m = p.matcher("cv3 456 g@# $%vf#$ gh");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
