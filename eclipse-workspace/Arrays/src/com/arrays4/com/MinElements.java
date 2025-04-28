package com.arrays4.com;
import java.util.Scanner;

public class MinElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter arry Size");
		int [] a=new int[scan.nextInt()];
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Orginal arrya");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Min element in Array");
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]<min)
		{
			min=a[i];
			
		}
			
	}
	System.out.print(min+" ");
	
	
	}
}
