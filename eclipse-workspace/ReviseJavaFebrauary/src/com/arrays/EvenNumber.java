package com.arrays;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ARRAY SIZE");
		int a[]=new int[scan.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter THE ELEMENTS IN INDEX "+(i+1));
			a[i]=scan.nextInt();
		}
		
		//fetching the orginal Array
		System.out.println("Fetching the ORGINAL ARRAY..");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//EVEN logic code
		System.out.println("Printing only EVEN NUMBERS...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
