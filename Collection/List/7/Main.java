import java.util.*;
class Employee
{
    int empId;
    String empName;
    String email;
    String gender;
    double salary;
    Employee(int empId,String empName,String email,String gender,double salary)
    {
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.gender=gender;
        this.salary=salary;
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Employee e1= new Employee(1,"mohd","mohd123@gmail.com","male",12400.00);
	    Employee e2= new Employee(2,"ahmad","ahmad13@gmail.com","male",15400.00);
	    Employee e3= new Employee(3,"faraz","faraz3@gmail.com","male",16600.00);
	    Employee e4= new Employee(4,"ram","ram12123@gmail.com","male",170000.00);
	    Employee e5= new Employee(5,"man","man23@gmail.com","male",16700.50);
	    Vector<Employee> v= new Vector<Employee>();
v.addElement(e1);
v.addElement(e2);
v.addElement(e3);
v.addElement(e4);
v.addElement(e5);
System.out.println("Employee details using Iterator ");
 Iterator<Employee> itr=v.iterator();
        while(itr.hasNext())
        {
            Employee e=itr.next();
           System.out.println("Employee id is "+e.empId+" Employee name is "+e.empName+" employee email is "+e.email+" employee gender is "+e.gender+" employee slary is "+e.salary);
        }
        System.out.println("Employee details using Enumeration ");

Enumeration<Employee> m=v.elements();
while(m.hasMoreElements())
{
    Employee e=m.nextElement();
    System.out.println("Employee id is "+e.empId+" Employee name is "+e.empName+" employee email is "+e.email+" employee gender is "+e.gender+" employee slary is "+e.salary);

}
	}
}


