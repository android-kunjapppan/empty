class FIRST
{
	public static void main(String args[])
	{
		int[] num = {65, 120, 98, 75, 115};
		int sml=num[0];
		int first=num[0];
		int second=num[0];
		for(int i=0;i<num.length;i++)
		{
		    if(num[i]>first)
		    {
		        first=num[i];
		        break;
		    }
		  else if(num[i]<sml)
		        sml=num[i];
		 
		  
		}
		for(int i=0;i<num.length;i++)
		{
		   if(num[i]>second&&num[i]<first)
		    {
		        second=num[i];
		  } 
		  
		}
	    System.out.println(first);
	    System.out.println(second);
	    System.out.println(sml);
	    }
	}