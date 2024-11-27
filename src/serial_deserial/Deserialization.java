package serial_deserial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	// Deserialization is the reverse process where the byte stream is used to recreate the actual java object in memory
	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream("E:\\Pawar Sir Java Videos\\Serialization\\test.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student o = (Student) ois.readObject();

			System.out.println(o.stuRollNo);
			System.out.println(o.stuName);
			System.out.println(o.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
