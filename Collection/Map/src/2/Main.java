import java.util.*;
public class Main
{
    static HashMap hm = new HashMap();
    static String checkKey(Object obj)
    {
        String s1="";
        boolean b= false;
        Set s= hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getKey().equals(obj)){
            b=true;
            break;
                
            }
        }
         if(b==true)
        s1=obj +" exists in Map";
        else
        s1=obj+" not exists in Map";
        return s1;
        
    }
    static String checkValue(Object obj)
    {
        String s1="";
        boolean b= false;
        Set s= hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getValue().equals(obj)){
            b=true;
            break;
                
            }
        }
        if(b==true)
        s1=obj +" exists in Map";
        else
        s1=obj+" not exists in Map";
        return s1;
        
    }
    public static void  display(HashMap m1)
    {
        Set s= hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
           System.out.println(m.getKey()+"   "+m.getValue());
        }
    
    }
	public static void main(String[] args) {
	
		hm.put(1,"cat");
		hm.put(2,"rat");
		hm.put(3,"bat");
		hm.put(4,"man");
		hm.put(5,"bottle");
		hm.put(6,"table");
		Main m2= new Main();
		System.out.println(m2.checkKey(2));
		System.out.println(m2.checkKey(8));
		System.out.println(m2.checkValue("rat"));
		System.out.println(m2.checkValue("pen"));
		System.out.println(m2.checkKey(4));
		System.out.println(m2.checkValue("chair"));
		m2.display(hm);


		
	}
}

