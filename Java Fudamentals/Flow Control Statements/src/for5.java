class PR{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(args[0]==null)
			System.out.println("Please enter an integer number");
		else if(a==1||a==0)
			System.out.println(a+ " is neither prime nor composite");
		for(int i=2;i<=a;i++)
	    	{
	        	if(a%i==0)
	        		{
	        		System.out.println(a+" is not a prime number");
	        		break;
	        		}
	        		
	        	else
	        	{
	        		System.out.println(a+ " is a prime number");
	            	break;
	        	}
	        
	    }
}
}