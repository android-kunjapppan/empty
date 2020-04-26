import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String [] args)
    {
        Properties p= new Properties();
       try {
           FileInputStream fis= new FileInputStream("countryData.txt");
           p.load(fis);
       } catch(IOException e) {
           e.printStackTrace();
       }
       Enumeration e = p.propertyNames();
    while (e.hasMoreElements()) {
        String key = (String) e.nextElement();
        String value = p.getProperty(key);
        System.out.println("Capital of "+key + " is : " + value);
    }
        
    }
}
