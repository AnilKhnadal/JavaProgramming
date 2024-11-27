package serial_deserial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
// Serialization is a mechanism of concerting the state of an object into a byte stream
	public static void main(String[] args) {
		
		Student s=new Student();
		
		try {
			FileOutputStream fos=new FileOutputStream("E:\\Pawar Sir Java Videos\\Serialization\\test.txt");
			ObjectOutputStream oos=new  ObjectOutputStream(fos);
			oos.writeObject(s);
			
			oos.close();
			fos.close();
			
			System.out.println("Serialized Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
