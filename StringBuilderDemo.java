package com.simplilearn.datatype.package2;

public class StringBuilderDemo {
	public static void main(String[] args)
	{
		String str1="simplilearn";
		System.err.println("Display all method of the StringBuffer is");
		StringBuilder sbu= new StringBuilder(str1);
		System.out.println(sbu);
		//capacity method
		System.out.println(sbu.capacity());
		//codepointBefore method
		System.out.println(sbu.codePointBefore(1));
		//insert method
		System.out.println(sbu.insert(1, 10.00));
		//compareTo method
		StringBuilder sbu1=new StringBuilder("Learning");
		System.out.println(sbu.compareTo(sbu1));
		//equals method
		System.out.println(sbu1.equals(sbu));
		//indexof method
		System.out.println(sbu1.indexOf(str1));
		//substring method
		System.out.println(sbu1.substring(5));
		//append method
		System.out.println(sbu1.append("isgood"));
		//delete method
		System.out.println(sbu1.delete(5, 10));
		//replace method
		System.out.println(sbu1.replace(0, 2, str1));
		//reverse method
		System.out.println(sbu1.reverse());
		//reverse method
		System.out.println(sbu1.reverse());
			
	}
}

