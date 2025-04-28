package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MerginTwoArray {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Size A Array...");
		//Creating A arayy
		int a[]=new int [scan.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter The value in index "+(i+1));
			a[i]=scan.nextInt();
		}
		
		//creating B array
		System.out.println("Enter The Size B Array...");
		int b[]=new int[scan.nextInt()];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter The value in index "+(i+1));
			b[i]=scan.nextInt();
		}
	//creating C array for merging purpose
		int c[]=new int[a.length+b.length];
		int ci=0;
		//Adding the A array to the C array 
		for(int i=0;i<a.length;i++)
		{
			c[ci]=a[i];
			ci++;
		}
		
		//Adding the B array to the C array
		
		for(int i=0;i<b.length;i++)
		{
			c[ci]=b[i];
			ci++;
		}
		
		//fetching the Merging Array
		System.out.println("Fetching the Merging The Array..");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		//fetching the merging array by using toString() Method
		System.out.println(Arrays.toString(c));
		
		
	
		
		
	}

}
