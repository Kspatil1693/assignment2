package com.simplilearn.datatype.package2;
import java.util.*;
public class CollectionVector {
	public static void main(String[] args)
	{
		System.out.println("Vector of Data");
		Vector v1=new Vector();
		v1.addElement(50);
		v1.addElement("one");
		v1.addElement(2.02);
	    v1.addElement('n');
	    v1.add(100);
		System.out.println(v1);
		System.out.println("---------------------");
		System.out.println("Linked List Data");
		LinkedList <String> list=new LinkedList<String>();
		list.add("abc");
		list.add("xyz");
		System.out.println(list);
		
		Iterator <String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("-----------------");
		
		System.out.println("Hash Data");
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(500);
		h1.add(10);
		h1.add(125);
		h1.add(20);
		h1.add(60);
		System.out.println(h1);
	System.out.println("----------------------");
	System.out.println("LinkedHash set Data");
	
	}

}











