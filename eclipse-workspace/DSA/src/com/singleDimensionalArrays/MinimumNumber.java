package com.singleDimensionalArrays;

import java.util.Scanner;

public class MinimumNumber {
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter SIZE");
		int [] arr=new int[scan.nextInt()];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Fetching ORIGNAL data");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
		System.out.println("Fetching The Minimum Elment");
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
			
		
	}

}
