import java.util.*;
public class Main
{
    static HashMap<String,Integer> contactList = new HashMap<String,Integer>();
    static String checkName(String obj)
    {
        String s1="";
        boolean b= false;
        Set s= contactList.entrySet();
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
        s1=obj +" exists in Contacts list";
        else
        s1=obj+" not exists in Contacts list";
        return s1;
        
    }
    static String checkNumber(Integer obj)
    {
        String s1="";
        boolean b= false;
        Set s= contactList.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            if(m.getValue()==obj){
            b=true;
            break;
                
            }
        }
        if(b==true)
        s1=obj +" exists in Contacts list";
        else
        s1=obj+" not exists in Contacts list";
        return s1;
        
    }
    public static void  display(HashMap contactList)
    {
        Set s= contactList.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
           System.out.println(m.getKey()+"   "+m.getValue());
        }
    
    }
	public static void main(String[] args) {
	
		contactList.put("ahmad",1234567);
		contactList.put("faraz",817681);
		contactList.put("sharim",905238);
		contactList.put("ram",987653);
		contactList.put("shyam",98762);
		contactList.put("rahul",7654387);
		Main m2= new Main();
		System.out.println(m2.checkNumber(2));
		System.out.println(m2.checkNumber(1234567));
		System.out.println(m2.checkName("ram"));
		System.out.println(m2.checkName("faiz"));
		System.out.println(m2.checkNumber(98762));
		System.out.println(m2.checkName("monu"));
		m2.display(contactList);


		
	}
}

