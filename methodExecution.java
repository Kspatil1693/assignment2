package com.simplilearn.datatype.package2;

public class methodExecution {
	public int multipynumber(int a,int b)
	{
		int z=a*b;
		return z;
	}
	public static void main(String[] args)
	{
		methodExecution b=new methodExecution();
		int ans=b.multipynumber(10, 3);
		System.out.println("multipication is "+ans);
		
	}

}
