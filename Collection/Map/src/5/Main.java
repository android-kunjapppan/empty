import java.util.*;
public class Main
{
    static TreeMap M1=new TreeMap();
    public static  TreeMap saveCountryCapital(String countryName,String capital)
    {
         M1.put(countryName,capital);
         return M1;
        
    }
    public static String  getCapital(String countryName)
    {
        String s1=null;
        Set s=M1.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getKey().equals(countryName))
            s1=(String)m.getValue();
        }
        return s1;
    }
     public static String  getCountry(String capitalName)
    {
        String s1=null;
        Set s=M1.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getValue().equals(capitalName))
            s1=(String)m.getKey();
        }
        return s1;
    }
    static TreeMap M2=new TreeMap();
    public static TreeMap converttoMap(TreeMap M1)
    {
        Set s=M1.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            M2.put(m.getValue(),m.getKey());
        }
        return M2;
        
    }
    static ArrayList al=new ArrayList();
     public static ArrayList converttoAl(TreeMap M1)
    {
        Set s= M1.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            al.add(m.getKey());
        }
     return al;   
    }
	public static void main(String[] args) 
	{
	    Main m= new Main();
	    System.out.println( m.saveCountryCapital("India","Delhi"));
	     System.out.println( m.saveCountryCapital("nepal","Kathmandu"));
	    System.out.println( m.saveCountryCapital("bhutan","Thimphu"));
	    System.out.println( m.saveCountryCapital("us","Washington d.c."));
	    System.out.println( m.saveCountryCapital("uk","London"));
	    System.out.println( m.saveCountryCapital("iran","tehran"));
	   System.out.println( m.getCountry("Delhi"));
	    System.out.println(m.getCountry("Thimphu"));
	     System.out.println(m.getCountry("London"));
	      System.out.println( m.getCapital("us"));
	    System.out.println(m.getCapital("India"));
	     System.out.println(m.getCapital("bhutan"));
 System.out.println( m.converttoMap(M1));
  System.out.println( m.converttoAl(M1));

	    
	}
}



