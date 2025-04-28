package com.sortings;
import java.util.Scanner;

public class BuubleSorting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int [] a=new int[scan.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element "+i+" index");
			a[i]=scan.nextInt();
		}
		System.out.println("Original Elements");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("After BUBBLE SORTING");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=a[j];
				}
			}
		}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
		
	}

}
