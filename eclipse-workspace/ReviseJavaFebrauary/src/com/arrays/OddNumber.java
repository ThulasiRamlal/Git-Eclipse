package com.arrays;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size array");
		int[]a=new int [scan.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENter The Values in index  "+(i+1));
			a[i]=scan.nextInt();
		}
		//fetching the orginal array
		System.out.println("Fetching ORIGINAL array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		//odd number businaess logic
		System.out.println("Printing only ODD NUMBERS..");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.print(a[i]+ " ");
			}
		}
		
		
		
		
		
	}

}
