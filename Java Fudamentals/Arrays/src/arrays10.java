class BIG
{
	public static void main(String args[])
	{
		int Number[][]=new int[3][3];
        int i,j;
        String m;
        System.out.println("Enter Elements for Matrix 3x3 :");
        int k=0;
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                
                Number[i][j]=Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("Elements in Matrix are : ");
                                System.out.println("");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(Number[i][j]+"\t");
            }
            System.out.println();
        }
        int max=Number[0][0];
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                if(Number[i][j]>max)
                {
                    max=Number[i][j];
                }
                    
                    
            }
            
        }
        System.out.println(max);
	}
	}