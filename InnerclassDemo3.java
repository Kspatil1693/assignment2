package com.simplilearn.datatype.package2;
abstract class AnonymousInnerclass
{
	public abstract void display();
	{
		System.out.println("data of Anonymous inner class");
	}
	}
public class InnerclassDemo3 {
	public static void main(String[] args) 
	{
		AnonymousInnerclass i=new AnonymousInnerclass()
				{
			      public void display()
			      {
			    	 System.out.println("Anonymous Inner Class"); 
			      }
			
				};
				i.display();
		
	}

}