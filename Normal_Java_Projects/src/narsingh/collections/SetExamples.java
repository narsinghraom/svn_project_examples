package narsingh.collections;

import java.util.*;
public class SetExamples {
	
	public void hashSet()
	{
		HashSet hs=new HashSet();// non generic class
		hs.add(1);
		hs.add(1);
		hs.add("dhatri");
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("narsingh");
		hs1.add("narsingh");
		hs1.add("shekar");
		hs1.add("supriya");
		HashSet<String> hs11=new HashSet<String>();
		hs11.add("krishna");
		hs11.add("saharsh");
		hs11.add("shekar");
		//hs1.addAll(hs11);
		//hs1.remove("shekar");
	//	hs11.remove("shekar");
		//hs1.removeAll(hs11);
		//System.out.println(hs11);
		hs1.retainAll(hs11);
		System.out.println(hs1);
		HashSet<Float> hs2=new HashSet<Float>();
		hs2.add(10.2f);
		hs2.add(10.2f);
		hs2.add(1.0f);
		System.out.println(hs2);
		Iterator<Float> i1=hs2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
	public void treeSet()
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(1);
		t1.add(10);
		t1.add(6);
		t1.add(1);
		t1.add(3);
		System.out.println(t1);
		Iterator<Integer> i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

	public static void main(String[] args) {
		SetExamples se=new SetExamples();
		//se.hashSet();
		se.treeSet();

	}

}
