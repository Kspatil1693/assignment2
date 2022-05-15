package com.simplilearn.datatype.package2;

import java.util.Scanner;

public class multiarray {
	public static void main(String[] args)
	{
		System.out.println("---------------MultiDimensional array-----------");
		System.out.println("-----------static Approach-----------");
		int [][] b= {{2,3,5},{6,7,8}};
		System.out.println("Length of array b[0] is"+b[0].length);
		System.out.println("Length of array b[1]is"+b[1].length);
		System.out.println("-------------Dynamic Approach------------");
		System.out.println("Enter the array element");
		Scanner sc1= new Scanner(System.in);
	
		int[][]b1=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
			System.out.println("Element of array is "+(j+1));
			
			b1[i][j]=sc.nextInt();
		}}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			System.out.println("Element of array is "+(j+1)+"is"+b1[i][j]);
		
		}
		}

}
