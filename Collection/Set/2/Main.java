import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	     HashSet<String> h1=new HashSet<String>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("how many employee you want to insert ");
	    int n= sc.nextInt();
		 System.out.println("Enter names");
	    for(int i=0;i<n;i++)
	    h1.add(sc.next());
	    System.out.println("employee names are : ");
	     Iterator itr=h1.iterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            System.out.println(s);
        }
        
	}
}


