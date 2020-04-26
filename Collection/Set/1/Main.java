import java.util.*;
public class Main
{
    static HashSet h1=new HashSet();
    public static  String saveCountryNames(String countryName)
    {
        h1.add(countryName);
        return countryName;
    }
    public static String  getCountry(String countryName)
    {
        String s1=null;
        Iterator itr=h1.iterator();
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            if(s.equals(countryName))
            s1=countryName;
        }
        return s1;
    }
	public static void main(String[] args) 
	{
	    Main m= new Main();
	    System.out.println( m.saveCountryNames("India"));
	     System.out.println( m.saveCountryNames("Nepal"));
	    System.out.println( m.saveCountryNames("Bhutan"));
	    System.out.println( m.saveCountryNames("US"));
	    System.out.println( m.saveCountryNames("UK"));
	    System.out.println( m.saveCountryNames("Iran"));
		
	    System.out.println(h1);
		
	   System.out.println( m.getCountry("India"));
	    System.out.println(m.getCountry("China"));
	     System.out.println(m.getCountry("Japan"));

	
	}
}


