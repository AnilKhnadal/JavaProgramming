package string_Tockenizer;

import java.util.StringTokenizer;

public class HasMoreToken2 {

	public static void main(String[] args) {
		
		int count=0;
		
		StringTokenizer str=new StringTokenizer("12-12-2012", "-");
		while(str.hasMoreTokens()) // It will Spit the space to new line
		{
			String split = str.nextToken();
			count++;
			System.out.println(split);
		}
		System.out.println("Number of counts : "+count);
	}
}
