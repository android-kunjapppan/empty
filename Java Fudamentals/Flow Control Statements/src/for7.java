class STAR
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if (args[0]==null)
			System.out.println("Please enter an integer number");
			
		for(int i=0;i<=a;i++)
		{
		    for (int j=0;j<=i;j++)
		    {
			System.out.print("*");
		    }
			System.out.println();
		}
	}
}