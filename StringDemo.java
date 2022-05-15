package com.simplilearn.datatype.package2;

public class StringDemo {
	private static final int O = 0;

	public static void main(String[] args)
	{
		System.out.println("Methods of string");
		//length
		String s1=new String ("HelloWorld");
		System.out.println(s1.length());
		
		//subString
		String s2=new String ("welcome");
		System.out.println(s2.substring(4));//deleting first four element
		
		//comparison
		String s3=new String ("welcome");
		String s4=new String ("welCome");
		System.out.println(s3.compareTo(s4));//ascii value of character
		
		//Isempty
		String s5="";
		System.out.println(s5);
		
		//tolower
		String s6=new String ("SMALL");
		System.out.println(s6.toLowerCase());
		
		//replace
		String s7="Heldo";
		  
		  System.out.println(s7.replace('e', 'E'));
		
		//equals
		String x="welcome to java";
		String y="WelcoME tO Java";
		System.out.println(x.equals(y));
	 
		
		System.out.println("\n");
	   System.out.println("Creating String Buffer");
	   StringBuffer s= new StringBuffer ("welcome to java!");
	   s.append("Enjoy the your learning");
	   System.out.println(s);
	   //insert method
	   s.insert(O, 'M');
	   System.out.println(s);
	   //replace method
	   StringBuffer sb=new StringBuffer("Hello");
	   sb.replace(O, 2, "hEl");
	   System.out.println(sb);
	 //delete method
	   sb.delete(O, 1);
	   System.out.println(sb);
	   System.out.println("-----------------------");
	   //StringBuilder
	   System.out.println("Creating the StringBuilder");
	   StringBuilder sbu=new StringBuilder("Happy");
	   sbu.append("Learning");
	   System.out.println(sbu);
	   //delete method
	   System.out.println(sbu.delete(0, 1));
	   //insert method
	   System.out.println(sbu.insert(1, "welcome"));
	   //reverse method
	   System.out.println(sbu.reverse());
	   
	   //conversion 
	   System.out.println("Conversion of String object to StringBuffer and String Builder");
	   String str="Hello";
	   //conversion of string object to string buffer
	   StringBuffer sbr=new StringBuffer(str);
	   sbr.reverse();
	   System.out.println("String to StringBuffer");
	   System.out.println(sbr);
	   //conversion of string object to string buffer
		StringBuilder sbu1 =new StringBuilder(str);
		sbu1.append("world");
		System.out.println("string to stringbuilder");
		System.out.println(sbu1);
		}

}












