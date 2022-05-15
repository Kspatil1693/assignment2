package com.simplilearn.datatype.package2;

public class StringBufferDemo {

	public static void main(String[] args)
	{   String str="Narendra";
		System.out.println("Display all method of StringBuffer");
		//append method
		StringBuffer sbr=new StringBuffer(str);
		sbr.append("Dilip");
		System.out.println(sbr);
		//append method for char
		sbr.append('A');
		System.out.println(sbr);
		//append char String also
		sbr.append("Pawar");
		System.out.println(sbr);
		//append character sequence
		StringBuffer sbr1=new StringBuffer("hello world");
		//sbr1.append(sbr1);
		System.out.println(sbr1.append("happy"));
		//append double
		System.out.println(sbr.append(10.0));
		//all capacity of string
		System.out.println(sbr.capacity());
		//charAt method for string
		System.out.println(sbr.charAt(5));
		//codePoint method assci value
		System.out.println(sbr.codePointAt(1));
		//codePointBefore method
		System.out.println(sbr.codePointBefore(1));
		//compareTo method
		StringBuffer sbr2=new StringBuffer("Dilip pawar");
		System.out.println(sbr2.compareTo(sbr));
		//equal method
		System.out.println(sbr2.equals(sbr1));
		//hashcode method
		System.out.println(sbr2.hashCode());
		//indexof method for abstract stringbuffer
		System.out.println(sbr.indexOf(str));
		//print character between string 1 up to this 10
		System.out.println(sbr.substring(1,10));
		//appendcode point of string
		System.out.println(sbr.appendCodePoint(1));
		//tostring method...print string same as
		System.out.println(sbr.toString());
		//delete method 0 index to 7
		System.out.println(sbr.delete(0, 7));
		//delete single character deleteCharAt method
		System.out.println(sbr1.deleteCharAt(1));
		//getclass method
		System.out.println(sbr1.getClass());
		//insert method 
		System.out.println(sbr1.insert(0, str));
		//reverse method
		System.out.println(sbr1.reverse());
		//subsequence method
		System.out.println(sbr1.subSequence(0, 7));
	//insert method
		System.out.println(sbr1.insert(0, sbr2));
		
	}
}










