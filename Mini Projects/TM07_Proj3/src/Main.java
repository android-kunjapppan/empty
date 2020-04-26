import java.util.*;
class Card
{
    private char symbol;
    private int number;
    Card() {}
     public void setSymbol(char symbol)
    {
      this.symbol = symbol;
    }
     public void setNumber(int number)
    {
      this.number = number;
    }
     public char getSymbol()
    {
      return symbol;
    }
     public int getNumber()
    {
      return number;
    }
}
public class Main
{
    public static void display(HashSet<Card> h,int no)
    {
        System.out.println("Four symbols gathered in "+no+" cards.");
        System.out.println("Cards in Set are :");
        Iterator<Card> itr =h.iterator();
        while(itr.hasNext())
        {
            Card c= itr.next();
            System.out.println(c.getSymbol()+" "+c.getNumber());
        }
    }
	public static void main(String[] args) {
		HashSet<Card> set= new HashSet<Card>();
		Scanner sc = new Scanner(System.in);
		 ArrayList a= new ArrayList();
		int no=0;
		int count=0;
		do{
		    no++;
		System.out.println("Enter a card :");
		char ch = sc.next().charAt(0);
		int num=sc.nextInt();
		if(a.contains(ch)==false)
		{
		    count++;
		Card c= new Card();
		c.setSymbol(ch);
		c.setNumber(num);
		set.add(c);
		    a.add(ch);
		}
		}while(count!=4);
		Main m= new Main();
		m.display(set,no);
	}
}

