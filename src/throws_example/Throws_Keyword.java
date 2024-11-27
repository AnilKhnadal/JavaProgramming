package throws_example;
import java.io.FileWriter;
import java.io.IOException;

/* It is applied on a method, if any exception occurs in a method than the exception 
   will be passed on calling statement of themethod
 */

public class Throws_Keyword {

	public static void main(String[] args) throws IOException {
		
		Throws_Keyword th=new Throws_Keyword();
		th.test();
	}

	public void test() throws IOException {
		
		FileWriter fw=new FileWriter("E:\\\\Pawar Sir Java Videos\\\\Serialization\\\\test.txt"); // any path
	}
}
