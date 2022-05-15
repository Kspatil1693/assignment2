package com.simplilearn.datatype.package2;

public class StringClassDemo {
	public static void main(String[] args) 
	{
		System.out.println("Display all method of String class");
		String str=new String();
		str="MyW orld";
		//char method
		System.out.println(str.charAt(0));
		//compare To method
		String str1="welcome";
		System.out.println(str1.compareTo(str));
		//compareToIgnorecase method
		System.out.println(str1.compareToIgnoreCase(str));
		//concat method
		System.out.println(str1.concat(str));
		//contains method
		System.out.println(str1.contains(str1));
		//contentEquals method
		System.out.println(str1.contentEquals(str1));
		//endsWith method
		System.out.println(str1.endsWith(str1));
		//equals method
		System.out.println(str.equals(str1));
		//equalsIgnoreCase method
		System.out.println(str1.equalsIgnoreCase(str));
		//format method
		System.out.println(str1.format(str,args));
		//indexof method
		System.out.println(str1.indexOf(2));
		//valueof method
		System.out.println(str1.valueOf('e'));
		//length method
		System.out.println(str.length());
		//replace method
		System.err.println(str1.replace('w', 'W'));
		//replacefirst method
		System.out.println(str1.replaceFirst(str1, str));
		//repeat method
		System.out.println(str.repeat(3));
		//replaceAll method
		String str3="newone";
		System.out.println(str.replaceAll(str, str3));
		//intern method
		System.out.println(str1.intern());
		
		
		
		
	}

}










