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
		ArrayList<String> list=new ArrayList<String>();
		list.add("sunday");
		list.add("monday");
		list.add("tuesday");
		list.add("wednesday");
		list.add("thursday");
		list.add("friday");
		list.add("saturday");
		Main m= new Main();
		m.printAll(list);
		
	}
}

