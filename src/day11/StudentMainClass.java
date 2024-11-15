package day11;

public class StudentMainClass {
	
    public static void main(String[] args) 
    {
    	//StudentClass stu=new StudentClass();
		
    	// 1) Using Object reference variable
    	
    	/*
    	stu.sid=101;
    	stu.sname="Anil";
    	stu.grd='A';
    	
    	stu.printStudentData();
    	*/
    	
    	// 2) using method
    	
    	/*
    	stu.setStudentData(102, "Kumar", 'B');
    	stu.printStudentData();
    	*/
    	
    	// 2) using constructor //name should be class name
    	
    	StudentClass stu=new StudentClass(103,"Sunil",'C');

    	stu.printStudentData();
    }
}
