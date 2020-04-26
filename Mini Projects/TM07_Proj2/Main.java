import java.util.*;
public class Main 
{
    static Scanner sc = new Scanner(System.in);
    static  ArrayList<String> l=new ArrayList<String>();
    public static void insert()
    {
        System.out.println("Enter the item to be inserted:");
        String s= sc.next();
        l.add(s);
        System.out.println("Inserted successfully");
    }
    public static void search()
    {
        boolean b=false;
        System.out.println("Enter the item to search :");
        String s= sc.next();
        Iterator<String> itr=l.iterator();
        while(itr.hasNext())
        {
            if(s.equals(itr.next()))
            {
            b= true;
            break;
            }
        }
        if(b==true)
        System.out.println("Item found in the list.");
        else
        System.out.println("Item not found in the list.");
    }
    public static void delete()
    {
        boolean b= false;
        System.out.println("Enter the item to delete :");
        String s=sc.next();
         Iterator<String> itr=l.iterator();
        while(itr.hasNext())
        {
            if(s.equals(itr.next()))
            {
            b= true;
            break;
            }
        }
        if(b==true)
        {
            l.remove(s);
        System.out.println("Deleted successfully");
        }
        else
        System.out.println("Item does not exist.");
    }
    public static void display()
    {
         Iterator<String> itr=l.iterator();
        while(itr.hasNext())
        {
           System.out.println(itr.next());
        }
    }
        
    
    public static void main(String[] args) 
    {
        Main m = new Main();
         int choice =0;
     do {
         System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
        System.out.println("enter your choice");
          choice=sc.nextInt();
         switch(choice)
         {
            case 1:
                m.insert();
                break;
            case 2:
                m.search();
                break;
            case 3:
                m.delete();
                break;
            case 4:
                m.display();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("bad input");
                break;
        }
    }while(choice!=5);
   
    }
}
