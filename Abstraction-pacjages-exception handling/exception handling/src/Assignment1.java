import java.util.Scanner;
class Assignment1
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter an integer");
     String str=sc.nextLine();
     try{
       int a=Integer.parseInt(str);
        System.out.println("The Square value is: "+a * a);
        System.out.println("The work has been done succesfully");
       }
     catch(NumberFormatException e)
       {
        System.out.println("Entered input is not a valid format for an integer");
        }
   sc.close();
  }
}