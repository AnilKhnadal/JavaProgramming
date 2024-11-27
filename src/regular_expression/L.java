package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L {

	public static void main(String[] args) {
	//	Pattern p = Pattern.compile("a*");
	//	Pattern p = Pattern.compile("a+");
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("aabgaaajaaaaakjj");

		while (m.find()) {
			System.out.println(m.start() + "...." + m.group());
		}
	}
}
