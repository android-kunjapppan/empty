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
    void getEmployeeDetail()
    {
        System.out.println("Employee id is "+empId);
        System.out.println("Employee name is "+empName);
        System.out.println("Employee email is "+email);
        System.out.println("Employee gender is "+gender);
        System.out.println("Employee salary is "+salary);
    }
    
}
public class EmployeeDB
{
   static  ArrayList list=new ArrayList();
    boolean addEmployee(Employee e)
    {
       boolean a= list.add(e);
       return a;
    }
   boolean deleteEmployee(int empId)
    {
        boolean b=false;
        Iterator<Employee> itr=list.iterator();
        while(itr.hasNext())
        {
            Employee e=itr.next();
            if(e.empId==empId)
            {
                b=true;
            itr.remove();
            }
        }
        return b;
        
    }
 public  String showPaySlip(int empId)
    {
        String s="there is no employee with this employee id";
        Iterator<Employee> itr=list.iterator();
        while(itr.hasNext())
        {
            Employee e=itr.next();
            if(e.empId==empId)
            {
               s="salary of employee is "+e.salary;
            }
        }
        System.out.println(s);
        
        return s;
    }
	public static void main(String[] args)
	{
	    Employee e1= new Employee(1,"yawar","y_j@gmail.com","male",12400.00);
	    Employee e2= new Employee(2,"peter","peter@gmail.com","male",15400.00);
	    Employee e3= new Employee(3,"tom","tom@gmail.com","male",16600.00);
	    Employee e4= new Employee(4,"mark","mark@gmail.com","male",170000.00);
	    Employee e5= new Employee(5,"john","john@gmail.com","male",16700.50);
	EmployeeDB m =new EmployeeDB();
	m.addEmployee(e1);
	m.addEmployee(e2);
	m.addEmployee(e3);
	m.addEmployee(e4);
	m.addEmployee(e5);
 Iterator<Employee> itr=list.iterator();
        while(itr.hasNext())
        {
            Employee e=itr.next();
           System.out.println("Employee id is:"+e.empId+", Employee name is:"+e.empName+", Employee email is:"+e.email+", Employee gender is:"+e.gender+", Employee salary is:"+e.salary);
        }

	m.showPaySlip(6);
	e1.getEmployeeDetail();
	System.out.println(m.deleteEmployee(2));


	}
}


