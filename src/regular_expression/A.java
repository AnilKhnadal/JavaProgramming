package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class A {

	public static void main(String[] args) {
		try {
			Pattern p = Pattern.compile("[z]");
			Matcher m = p.matcher("a6b#@29Dcd");
			while (m.find()) {
				System.out.println(m.start() + "....." + m.group());
			}
		} catch (PatternSyntaxException e) {
			System.out.println("Regex syntax error: " + e.getMessage());
		}

	}
}
