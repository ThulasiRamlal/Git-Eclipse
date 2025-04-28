package com.arrays2;

import java.util.Scanner;

public class LeftRotate {
	public static void main(String[] args) {
		int [] a= {0,1,2,3,4,5,6,7,8,9};
		//
		System.out.println("input array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
	System.out.println("enter how many time you want rotate: ");
	int n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		int first=a[0];
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		a[a.length-1]=first;
	}
	//fetching rotate the data the data
	
		System.out.println("Left rotate in: "+n);
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
	}
}
