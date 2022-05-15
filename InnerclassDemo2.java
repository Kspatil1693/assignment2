package com.simplilearn.datatype.package2;

public class InnerclassDemo2 {
	private String msg="Innerclass";
	void display()
	{
		class Inner
		{
			void msg()
			{
				System.out.println(msg);
			}
		}
		Inner i=new Inner();
		i.msg();
	}
	public static void main(String[] args)
	{
		InnerclassDemo2 obj2=new InnerclassDemo2 ();
		obj2.display();
		
	}

}