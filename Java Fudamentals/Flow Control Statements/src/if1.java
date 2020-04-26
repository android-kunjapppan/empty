import java.util.Scanner;

class A
{
	public static void main(String arrgs[])
	{
		Scanner dis = new Scanner(System.in);
		int num = dis.nextInt();
		if(num>0)
		{
			System.out.println("Positive");
			}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else 
		{
			System.out.println("Zero");
		}
		
	}
}