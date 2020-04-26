import java.util.*;

class asteric
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";
		int low=0,high=str.length();
		for(int i=0;i<str.length();i++)
		{ System.out.println(i);
		    if(str.charAt(i)=='*')
		    {
		         System.out.println("low: "+low+"high: "+high);
		        high = i-1;
		        for(int j=low;j<high;j++)
		        {
		             s+=str.charAt(j);
		        }
		         System.out.println("low: "+low+"high: "+high);
		        System.out.println(s);
		        low = i+2;
		        high = str.length()-1;
		    }
		   
		    
		}
		if(low<=str.length()-1)
		{
		    for(int i=low;i<=high;i++)
		    {
		        s+=str.charAt(i);
		    }
		}
		System.out.println(s);
	}
}
