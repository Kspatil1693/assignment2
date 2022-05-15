package com.simplilearn.datatype.package2;
import java.util.*;
public class CollectionArray {
	public static void main(String[] args)
	{
		System.out.println("ArrayList Of Mixed Data");
		ArrayList A1=new ArrayList();
		ArrayList A=new ArrayList();
		A1.add(100);
		A1.add("one");
		A.add("two");
		A1.addAll(A);
		System.out.println(A1);
		System.out.println("---------------------------");
		System.out.println("Vector Of Mixed  Data");
		Vector v1= new Vector(A1);
		//clone method ....
		v1.clone();
		System.out.println(v1);
		v1.add(100);
		v1.addElement(A);
		System.out.println(v1);
		//clear method
		v1.clear();
		System.out.println(v1);
		System.out.println("------------------------");
		System.out.println("LinkedList of Data");
		LinkedList<String> list=new LinkedList<String>();
		//add method
		list.add("Welcome");
		//list.add(10);
		list.add("To");
		list.add("Java");
		System.out.println(list);
		//addfirst method
		list.addFirst("new");
		System.out.println(list);
		//addlast method
		list.addLast("old");
		System.out.println(list);
		//remove method
		list.remove(1);
		System.out.println(list);
		//peek method
		list.peek();
		System.out.println(list);
		//push method
		list.push("one");
		System.out.println(list);
		System.out.println("----------------------------------");
		System.out.println("Iterator of data ");
		Iterator <String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");
		System.out.println("PriorityQueue of Data");
		PriorityQueue <String> pq=new PriorityQueue<String>();
		pq.add("ten");
		pq.add("nine");
		System.out.println(pq);
		//poll method
		pq.poll();
		System.out.println(pq);
		pq.add("three");
		pq.add("four");
		pq.add("five");
		System.out.println(pq);
		Iterator <String>itr1=pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("---------------------------------");
		System.out.println("HashSet of Data");
		HashSet <Integer> hs=new HashSet<Integer>();
		hs.add(1000);
		hs.add(900);
		hs.add(700);
		hs.add(500);
		hs.add(80);
		hs.add(800);
		System.out.println(hs);
		Iterator<Integer>itr2=hs.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("---------------------------------------");
		System.out.println("LinkedHashSet of Data");
		LinkedHashSet <Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(5);
		lhs.add(10);
		lhs.add(2);
		lhs.add(1);
		lhs.add(53);
		lhs.add(100);
		System.out.println(lhs);
				
		
	}

}
























