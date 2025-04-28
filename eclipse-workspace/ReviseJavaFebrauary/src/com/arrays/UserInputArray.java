package com.arrays;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		
		//UserINput Array
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter Size Of ARRAY");
		int n=scan.nextInt();
		//Syntax of array
		int a[]=new int[n];
		
		//iterating loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Values..");
			a[i]=scan.nextInt();
			
		}
		//Fetching the Orginal Array
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
