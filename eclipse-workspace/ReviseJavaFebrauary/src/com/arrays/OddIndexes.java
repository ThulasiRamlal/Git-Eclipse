package com.arrays;

import java.util.Scanner;

public class OddIndexes {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The SIZE of array...");
		int a[]=new int[scan.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the elements in indexes "+(i+1));
			a[i]=scan.nextInt();
		}
		
		System.out.println("Fetching the ORGINAL ARRAY..");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Fetching only ODD INDEXES VALUES...");
		//Business logic of OddINdexes
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
