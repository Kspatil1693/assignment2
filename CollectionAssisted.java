package com.simplilearn.datatype.package2;
import java.util.*;
public class CollectionAssisted {
	public static void main(String[] args)
	{
		System.out.println("Arraylist of data");
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Narendra");
		al.add("Pawar");
		al.add(100);
		System.out.println(al);
		
		System.out.println("ArrayList of specific data");
		ArrayList <String> city=new ArrayList<String>();
		city.add("Mumbai");
		city.add("Pune");
		System.out.println(city);
		
		
	}

}
