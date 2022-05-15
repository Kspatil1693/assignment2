package com.simplilearn.datatype.package2;
  class  ReturnType
{
	
	public int sum(int a,int b)
	{
		int add=a+b;
		return add;
		
	}
	public String str(String s1)
	{
		return s1;
	}
	public int welcome(int x,int y)
	{
		int i=0;
		for( i=x;i<y;i++)
		{
			System.out.println(i);
		}
		return i;
	}
	}
public class MethodReturnType
{
   public static void main(String[] args)
   {
	ReturnType rt1=new ReturnType();
	System.out.println("sum is="+(rt1.sum(8, 9)));
       System.out.println("String is="+(rt1.str("Value")));
       System.out.println("i of number is="+(rt1.welcome(2, 5)));
	
}
   

}

