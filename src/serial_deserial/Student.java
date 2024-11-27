package serial_deserial;

import java.io.Serializable;

public class Student implements Serializable {
	int stuRollNo = 10;
	String stuName = "Anilkumar";
	transient String password = "Provab@123";
}

/* transient keyword - transient is a variable modifier used in Serialization
 * At the time of serialization, if we dont want to save value of a particuler variable in a file, then we use transient keyword
 * When JVM comes across transient keyword, it ignores original value of the variable and save default value of that variable 
 * 
 * 
 */
