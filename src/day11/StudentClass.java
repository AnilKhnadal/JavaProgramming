package day11;

public class StudentClass {
    int sid;
    String sname;
    char grd;
    void printStudentData()
    {
    	System.out.println(sid+"  "+sname+"  "+grd);
    }
    
    void setStudentData(int id,String name, char gr)
    {
    	sid=id;
    	sname=name;
    	grd=gr;
    }
    
    StudentClass(int id,String name, char gr)  // constructor
    {
    	sid=id;
    	sname=name;
    	grd=gr;
	}
}
