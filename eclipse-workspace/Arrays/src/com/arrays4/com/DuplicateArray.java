package com.arrays4.com;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Size Array");
	int a[]=new int[scan.nextInt()];
	System.out.println("Enter "+a.length+" elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
	//=========================================
	System.out.println("Printing Original Array ");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	//==========Logic for Duplicate=========
	System.out.println("Printing The Duplicate elments");
	for(int i=0;i<a.length;i++)

	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	}
}
