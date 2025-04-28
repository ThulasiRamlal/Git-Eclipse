package com.singleDimensionalArrays;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=scan.nextInt();
		System.out.println("Enter a values");
	int [] arr=new int[size];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
	}

	
	}
}
