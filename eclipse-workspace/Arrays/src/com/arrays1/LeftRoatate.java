package com.arrays1;

import java.util.Scanner;

public class LeftRoatate {
	public static void main(String[] args) {
		int [] a= {0,1,2,3,4,5,6,7,8,9};
		//fetching tthe data
		System.out.println("Printing INput data: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Logic of left Rotate
		Scanner scan = new Scanner(System.in);
		System.out.println("enter many rotate: ");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];	
			}	
			a[a.length-1]=temp;
		}
		
		//fetching the data
		System.out.print("[");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			if(i<a.length-1)
			{
				System.out.print(", ");
				
			}
			else
			{
				System.out.print("]");
			}
		}
		
		
	}

}
