import java.util.InputMismatchException;
import java.util.Scanner;
class Assignment3
{
 public static void maib(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements in an array");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter the elements in the array");
      try{
        for(int i=0;i<n;i++)
         { arr[i]=sc.nextInt();}
        System.out.println("Enter the index of the array element you want to access");
         int ind=sc.nextInt();
        System.out.println("The array element at index"+ ind + " = " +arr[ind]);
        System.out.println("The array element successfully accessed");
        }
     catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
     catch(InputMismatchException e)
       {
        System.out.println("java.uti.InputMismatchException");
        }
      sc.close();
   }
}