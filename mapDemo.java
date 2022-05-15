package com.simplilearn.datatype.package2;
import java.util.*;
import java.util.Map.Entry;
public class mapDemo {
	public static void main(String[] args) 
	{
		System.out.println("HashMap Data is");
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2,"jimmy");
         hm.put(3,"jerry");
         hm.put(1,"tommy");
         //System.out.println(hm);
         System.out.println("\n the elements of hashmap is");
         for(Map.Entry m:hm.entrySet())
         {
        	 System.out.println(m.getKey()+" "+m.getValue());
         }
         System.out.println("------------------------------------");
         System.out.println("HashTable Data is");
         Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
         ht.put(05, "raj");
         ht.put(01, "sita");
         ht.put(06, "rima");
         ht.put(07, "kiva");
         for(Map.Entry n:ht.entrySet())
         {
        	 System.out.println(n.getKey()+" "+n.getValue());
         }
         System.out.println("----------------------------------");
         System.out.println("TreeMap Data is");
         TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
         tm.put(11, "abc");
         tm.put(15, "xyz");
         tm.put(18, "efg");
         tm.put(20, "stu");
         tm.put(12, "lmn");
         tm.put(17, "pqr");
         for(Map.Entry x:tm.entrySet())
      {
    	  System.out.println(x.getKey()+" "+x.getValue());
	  }
         
	}
	

}








