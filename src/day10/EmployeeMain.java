package day10;

//same package
public class EmployeeMain {
    public static void main(String[] args) {
    	Employee emp1=new Employee(); // object
    	emp1.eid=100;
    	emp1.ename="Anilkumar";
    	emp1.job="Manual Test";
    	emp1.sal=38000;
    	emp1.display();
    	
    	Employee emp2=new Employee(); // object
    	emp2.eid=101;
    	emp2.ename="Pramod";
    	emp2.job="Automation Test";
    	emp2.sal=150000;
    	emp2.display();
	}
}
