package narsingh.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class MapExamples {
	public void hashMap()
	{
		//abstract int i=0;
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		
		s.put(3,"narsing");
		s.put(2, "shewar");
		s.put(2, "shekar");
		s.put(1,"supriya");
		//s.clear();
		System.out.println(s);
		Object copy=s.clone();
		System.out.println(copy);
		
		boolean s1=s.containsKey(1);
        System.out.println(s1);
        
        boolean s2=s.containsValue("shekar");
        System.out.println(s2);
        
        Set<Map.Entry<Integer,String>> sett=s.entrySet();
        System.out.println("entry set " +sett);
        
        boolean bl=s.equals(copy);
        System.out.println(bl);
        
        int i= s.hashCode();
        int j=copy.hashCode();
        if(s==copy)
        {
        	System.out.println("s and copy are same");
        }
        if(i==j)
        {
        	System.out.println("i and j are same");
        }
        System.out.println("hash code of j" +j); 
        System.out.println("hash code of i" +i);
        System.out.println(s.get(2));
	}
	

	public static void main(String[] args) {
	//MapExamples mp=new MapExamples();
	//mp.hashMap();

	}
	public static void main(String args) {
		//MapExamples mp=new MapExamples();
		//mp.hashMap();

		}

}
