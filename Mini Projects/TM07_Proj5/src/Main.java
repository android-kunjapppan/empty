import java.util.*;
class Box
{
  double length;
  double width;
  double height;
  Box(double length,double width,double height)
  {
      this.length=length;
      this.width=width;
      this.height=height;
  }
  public boolean equals(Box b1,Box b2)
    {
         boolean b=false;
       double v1=b1.length*b1.width*b1.height;
       double v2=b2.length*b2.width*b2.height;
      if(v1==v2)
      b=true;
      return b;
    }
}

public class Main
{
    public static void display(HashSet<Box> set)
    {
        System.out.println("Unique Boxes in the Set are");
        Iterator<Box> itr = set.iterator();
        while(itr.hasNext())
        {
            Box b= itr.next();
            System.out.printf("Length = %.2f",b.length);
            System.out.printf(" Width = %.2f",b.width);System.out.printf(" height = %.2f",b.height);
            System.out.printf(" Volume = %.2f",(b.length*b.width*b.height));
            System.out.println();
        }
        
    }
    
    public static void main(String [] args)
    {
        HashSet<Box> set = new HashSet<Box>();
        ArrayList<Box> list= new ArrayList<Box>();
        Main m= new Main();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Box");
        int n= sc.nextInt();
         System.out.println("Enter box "+1+" Details: ");
            System.out.println("Enter the length");
            double length=sc.nextDouble();
            System.out.println("Enter the width");
            double width=sc.nextDouble();
            System.out.println("Enter the height");
            double height=sc.nextDouble();
            Box b=new Box(length,width,height);
            list.add(b);
            set.add(b);
        for(int i=2;i<=n;i++)
        {
            System.out.println("Enter box "+i+" Details: ");
            System.out.println("Enter the length");
             length=sc.nextDouble();
            System.out.println("Enter the width");
             width=sc.nextDouble();
            System.out.println("Enter the height");
             height=sc.nextDouble();
         b=new Box(length,width,height);
            boolean equa=false;
            for(int j=0;j<list.size();j++)
            {
                boolean a=b.equals(b,list.get(j));
                if(a==true)
                {
                    equa=true;
                    
                }
            }
            if(equa==false)
            {
                 set.add(b);
                 list.add(b);
            }
            
        }
        m.display(set);
    }
}



