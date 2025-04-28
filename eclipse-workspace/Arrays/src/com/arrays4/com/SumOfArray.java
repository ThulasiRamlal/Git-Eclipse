package com.arrays4.com;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Size");
		int [] a=new int[scan.nextInt()];
		System.out.println("Enter "+a.length+"  Elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Printing Orginal Array");
		for(int i:a)	
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Sum Of Array");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		  sum=sum+a[i];
		}
		System.out.print(sum+" ");
	}

}
