package string_Tockenizer;

import java.util.StringTokenizer;

public class HasMoreToken1 {

	public static void main(String[] args) {
		
		StringTokenizer str=new StringTokenizer("Anilkumar Nagappa Khanadal Dubalgundi");
		while(str.hasMoreTokens()) // It will Spit the space to new line
		{
			String split = str.nextToken();
			System.out.println(split);
		}
	}
}
