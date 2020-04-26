import java.util.*;
public class Main
{
    static 	ArrayList<String> list= new ArrayList<String>();
    public static ArrayList<String> display(String s1,String s2)
    {
        	//case 1
		 StringBuilder result = new StringBuilder();
    for(int i=0; i<s1.length(); i++)
    {
        char ch = s1.charAt(i);
        result.append((i%2 == 0) ? s2 : ch);
    }
    String result1= new String(result);
    list.add(result1);
    //case 2
    int occurrence = s1.split(s2, -1).length - 1;
		if (occurrence > 1)
			list.add(s1.substring(0, s1.lastIndexOf(s2)) + new StringBuilder(s2).reverse());
		else 
		list.add(s1+s2);
	//case 3
	if (occurrence > 1)
			list.add(s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length(), s1.length()));
	else
	list.add(s1);
 //case 4
 int divide  = s2.length() % 2 == 0 ? s2.length() / 2 : s2.length() / 2 + 1;
		list.add(s2.substring(0, divide) + s1 + s2.substring(divide, s2.length()));
		//case 5
	StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) 
		{
			if (s2.indexOf(s1.charAt(i)) != -1)
				sb.append('*');
			else
				sb.append(s1.charAt(i));
		}
		list.add(sb.toString());
		return list;
    }
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter s1 and s2 " );
		String s1= sc.next();
		String s2=sc.next();
	Main m= new Main();
	System.out.println(m.display(s1,s2));
	}
}

