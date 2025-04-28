package com.arrays4.com;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter A size array: ");
		int [] a=new int[scan.nextInt()];
		System.out.println("enter "+a.length+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter B size Aray: ");
		int [] b=new int[scan.nextInt()];
		System.out.println("enter "+b.length+" elemnts");
		for(int i=0;i<b.length;i++)
		{
			b[i]=scan.nextInt();
		}
		//==========================================================
		System.out.println("Fetchin Orginal Array");
		System.out.println("Printin A Array ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Printing B orginal Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		//==============================================================
		
		int [] c=new int[a.length+b.length];
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		c[count]=a[i];
		count++;
	}
	for(int i=0;i<b.length;i++)
	{
		c[count]=b[i];
		count++;
	}
	System.out.println("========================");
	System.out.println("Merging tWo Array");
	System.out.println();
	System.out.println("printing C array");
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	
	
		
	}
}
