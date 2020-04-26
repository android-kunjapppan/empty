import java.util.Scanner;

class B
{
	public static void main(String arrgs[])
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if((num%2)==0)
		{
			System.out.println("Even");
			}
		else
		{
			System.out.println("Odd");
		}
		
	}
}