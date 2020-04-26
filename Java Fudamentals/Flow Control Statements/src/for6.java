import java.util.Scanner;
class SUM
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	     int a = sc.nextInt();
	     int sum=0;
	     for(;a>0;)
	     {         
   	     int digit=a%10;
   	     sum=sum+digit;
	         a/=10;
	         
	         
	     }
     System.out.println(sum);
	}
}
