import java.util.*;
class Employee implements Comparator<Employee>
{
  private String firstName;
  private String lastName;
   private String mobile;
  private String email;
private String address;
  public Employee(){}
    public void setFirstName(String firstName)
    {
      this.firstName = firstName;
    }
     public void setLastName(String lastName)
    {
      this.lastName = lastName;
    }
     public void setMobile(String mobile) 
    {
      this.mobile = mobile;
    }
    public void setEmail(String email) 
    {
      this.email = email;
    }
    public void setAddress(String address) 
    {
      this.address = address;
    }
     public String getFirstName() 
     {
      return firstName;
    }
     public String getLastName()
     {
      return lastName;
    }
     public String getMobile()
     {
      return mobile;
    }
    public String getEmail()
    {
      return email;
    }
    public String getAddress()
    {
      return address;
    }
    public int compare(Employee o1, Employee o2) 
    {
        String s1=(String)o1.getFirstName();
        String s2=(String)o2.getFirstName();
      return s1.compareTo(s2);
    }

  }

public class Main
{
    public static void display(ArrayList<Employee> a)
    {
        System.out.println("Employee List: ");
        System.out.println();
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
         for (Employee s : a)
    {
    System.out.format("%-15s %-15s %-15s %-30s %-15s\n",s.getFirstName(),s.getLastName(),s.getMobile(),s.getEmail(),s.getAddress());
    }
    
        
    }
    public static void main(String [] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Main m= new Main();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Employees. ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter Employee "+i+" Details: ");
            System.out.println("Enter the Firstname");
            String first=sc.next();
            System.out.println("Enter the Lastname");
            String last=sc.next();
            System.out.println("Enter the Mobile");
            String mobile=sc.next();
            System.out.println("Enter the Email");
            String email=sc.next();
            System.out.println("Enter the Address");
            String address=sc.next();
            Employee e=new Employee();
      e.setFirstName(first);
      e.setLastName(last);
      e.setMobile(mobile);
      e.setEmail(email);
      e.setAddress(address);
      list.add(e);
        }
        Collections.sort(list,new Employee());
       m.display(list);
    }
}
