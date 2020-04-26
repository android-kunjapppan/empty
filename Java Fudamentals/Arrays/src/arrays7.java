class DUPLICATE
{
	public static void main(String args[])
	{
		int[] arr= {1,2,2,3};
		 
		int j = 0; 
		int[] temp = new int[10];
        for (int i=0; i<arr.length-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[arr.length-1];     
         
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        for (int i=0; i<arr.length-1; i++)  
           System.out.print(arr[i]+" ");	
	}
	}