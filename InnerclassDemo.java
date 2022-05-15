package com.simplilearn.datatype.package2;

public class InnerclassDemo {
	private String msg="welcome to java";
	
	class Inner
	{
		void display()
		{
			System.out.println("lets learn about inner class");
		}
	}

	public static void main(String[] args)
	{
		InnerclassDemo obj=new InnerclassDemo();
		
		InnerclassDemo.Inner in=obj.new Inner();
		in.display();
		
	}

	
	}
