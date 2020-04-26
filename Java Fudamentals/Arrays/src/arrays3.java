import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,8,9,10};
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(a==arr[i])
		    {
		        System.out.println(i);
		        flag=1;
		        break;
		    }
		    
		    
		}
		if(flag==0)
		{
		    System.out.println("-1");
		}
	
		
		
		
		        
	}
}