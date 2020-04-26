import java.util.*;
public class Main
{
    public static void printAll(ArrayList list)
    {
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
	public static void main(String[] args) {
		ArrayList<Number> list=new ArrayList<Number>();
		list.add(10);
		list.add(10.5);
		list.add(2000);
		list.add(20f);
		list.add(20.000f);
		list.add(0);
		
		Main m= new Main();
		m.printAll(list);
		
	}
}

