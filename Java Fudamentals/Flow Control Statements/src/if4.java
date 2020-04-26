import java.util.Scanner;
class AB
{

    public static void main (String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	char item1=sc.next().charAt(0);
        char item2=sc.next().charAt(0);
        if (item1>item2)
            System.out.println(item2+" , "+item1);
       
        else
            System.out.println(item1+" , "+item2);
    }
        
		
	
}