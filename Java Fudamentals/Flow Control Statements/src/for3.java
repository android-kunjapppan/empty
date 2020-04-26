import java.util.Scanner;
class FCE
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt();
	    for(int i=2;i<=a;i++)
	    {
	        if(a%i==0)
	            break;
	        else
	            System.out.println(a);
	            break;
	        
	    }
	}}

