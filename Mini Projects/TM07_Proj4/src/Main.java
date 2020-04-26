import java.util.*;
class Card
{
    char symbol;
    int number;
    Card(char symbol,int number)
    {
        this.symbol=symbol;
        this.number=number;
    }
     
}
public class Main
{
    static HashMap<Character,ArrayList<Integer>> map= new HashMap<Character,ArrayList<Integer>>();
	static ArrayList<Integer> a= new ArrayList<Integer>();
	 public static  void addCard(Character name,int number)
	 {
        if(map.containsKey(name)) 
        {
             map.get(name).add(number);             
        }else 
        {
            ArrayList<Integer> newList = new ArrayList<Integer>(1);
            map.put(name,newList);
            newList.add(number);
       }}
     public static void display()
     {
         System.out.println("Distinct Symbols are :");
         for(Map.Entry<Character,ArrayList<Integer>> mp : map.entrySet())
       {
          System.out.print(mp.getKey()+" ");
       }
       System.out.println();
       int count=0;
       int sum=0;
        for(Map.Entry<Character,ArrayList<Integer>> mp : map.entrySet())
       { count=0;
      sum=0;
          System.out.println("Cards in "+mp.getKey()+" Symbol");
          Collection c=mp.getValue();
          Iterator<Integer> itr= c.iterator();
          while(itr.hasNext())
          {
              count++;
          int y= itr.next();
          sum=sum+y;
              System.out.println(mp.getKey()+" "+y);
          }
          System.out.println("Number of cards : "+count);
         System.out.println("Sum of Numbers : "+sum);
       }
         
    }
    
	public static void main(String[] args)
	{
	
		 Scanner sc = new Scanner(System.in);
		 Main m= new Main();
		 System.out.println("Enter Number of Cards :");
		 int n= sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
		System.out.println("Enter card :"+i);
		char ch = sc.next().charAt(0);
		int num=sc.nextInt();
	Card c=new Card(ch,num);
	m.addCard(ch,num);
		}m.display();
	}
}


