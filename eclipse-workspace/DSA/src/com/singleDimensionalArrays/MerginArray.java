package com.singleDimensionalArrays;

import java.util.Scanner;
public class MerginArray {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter A SIZE");
	int [] a=new int[scan.nextInt()];
	System.out.println("Enter Values");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println("Enter B Size");
	int[] b=new int[scan.nextInt()];
	System.out.println("Enter Values");
	for(int i=0;i<b.length;i++)
	{
		b[i]=scan.nextInt();
	}

	int c1=0;
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[c1]=a[i];
		c1++;
	}
	for(int i=0;i<b.length;i++)
	{
		c[c1]=b[i];
		c1++;
	}
	System.out.println("Fetching MERGING Element");
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	

}
}
