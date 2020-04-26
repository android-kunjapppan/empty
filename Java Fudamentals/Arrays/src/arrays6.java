class SORT
{
	public static void main(String args[])
	{
		int[] num = {65, 120, 98, 75, 115};
		int temp=0;
		
		 for (int i = 0; i < num.length; i++) {     
            for (int j = i+1; j < num.length; j++) {     
               if(num[i] > num[j]) {    
                   temp = num[i];    
                   num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }    
        for(int k=0;k<num.length;k++)
	    {
	        System.out.println(num[k]);
	    }
	}
	}