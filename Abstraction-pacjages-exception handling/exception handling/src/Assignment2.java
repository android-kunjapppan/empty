import java.util.Scanner;
class Assignment2{
     public static void main(String[] args)
      {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of elements in the array");
        int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.println("enter the elements in the array:");
       for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();}
          System.out.println("enter the index of the array element you want to access");
          int ind=sc.nextInt();
          try
          {
            System.out.println("The array element at index "+ ind + " = " +arr[ind]);
            System.out.println("The array element successfully accessed");
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
             System.out.println("java.lang.ArrayIndexOutOfBoundsException");
           }
        sc.close();
          
     }
}
     