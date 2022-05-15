package com.simplilearn.datatype.package2;
import java.util.Scanner;
public class singleDimensionalArray {
	public static void main(String[] args) 
	{
		System.out.println("-----------static Approach-----------");
		int a[]= {10,20,30,40,50};
		for(int i=0;i<4;i++)
		{
			System.out.println("Element of array is a:"+a[i]);
		}
		System.out.println("-------------Dynamic Approach------------");
		System.out.println("Enter the array element");
		Scanner sc= new Scanner(System.in);
		
		int size=sc.nextInt();
		int a1[]=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Element of array is "+(i+1));
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("Element of array is "+(i+1)+"is"+a1[i]);
		
		}
		
		
	}

}





















