package com.arrays4.com;

import java.util.Scanner;

public class OddNUmber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array Size");
		int [] a=new int[scan.nextInt()];
		System.out.println("Enter a elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Printing Orignal array");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Printing Odd nUmber");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==1)
		{
			System.out.print(a[i]+" ");
		}
			
	}
	
	
	}

}
