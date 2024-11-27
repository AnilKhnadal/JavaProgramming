package pankaj;

import java.io.FileWriter;

public class FileWriterClass {

	public static void main(String[] args) {

		// Specify the file path to write to (make sure to replace with an actual path on your system)
		String filePath = "E://Pawar Sir Java Videos//JAVA//Day 0-Java.txt";

		// Create a FileWriter object for writing to the file
		FileWriter writer = null;

		try {
			// Create a FileWriter object to write text to the specified file
			writer = new FileWriter(filePath);

			// Writing text to the file
			writer.write("Hello, this is a test message written to the file.\n");
			writer.write("We can write multiple lines of text.\n");
			writer.write('A');
			writer.write(100);
			writer.close();

			System.out.println("Text has been written to the file successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
