import java.util.Scanner;
class PALINDROME
{
	public static void main(String args[])
	{
		
		int a = Integer.parseInt(args[0]);
		int temp=a;
	     int rev=0;
	     while(temp>0)
	     {
	         int digit = temp%10;
	         rev = rev*10 + digit;
	         temp/=10;
	     }
	      if(a==rev)
	    	  System.out.println(a+"is a palindrome");
	      else
	    	  System.out.println(a+"is not a palindrome");
	}
	
}