import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    TreeSet<String> h1=new TreeSet<String>();
	    h1.add("Bob");
		h1.add("Alice");
		h1.add("John");
		h1.add("Richard");
	    Iterator<String> itr=h1.descendingIterator();
		
		System.out.println("Reversing the elements of collection");
		 while(itr.hasNext())
		 {
			 String s2=itr.next();
			 System.out.println(s2);
		 }
	 
	     System.out.println("insert name you want to search in record");
	     String s=sc.next();
	     boolean result=false;
	     Iterator<String> itr1=h1.iterator();
        while(itr1.hasNext())
        {
            String s1=itr1.next();
            if (s1.equals(s)) {
				result = true;
				break;
			}
        }
        if (result)
        System.out.println(s + " exists");
		else 
		System.out.println(s + " doesn't exist");
        
	}
}


