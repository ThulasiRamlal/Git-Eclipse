package com.arrays;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of ARRAY");
		int n[]=new int[scan.nextInt()];
		for(int i=0;i<n.length;i++)
		{
			System.out.println("Enter the value in index "+(i+1));
			n[i]=scan.nextInt();
		}
		//fetching the orginal Array
		System.out.println("Fetching the ORGINAL array..");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
		//duplicate Logic code
		System.out.println();
		System.out.println("Fetching the DUPLICATE ELements...");
		for(int i=0;i<n.length;i++)
		{
			
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[j]);
				}
			}
			
		}
		
		
	}

}
