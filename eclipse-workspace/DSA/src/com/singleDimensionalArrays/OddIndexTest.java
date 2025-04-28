package com.singleDimensionalArrays;

import java.util.Scanner;

public class OddIndexTest {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		OddIndex odd=new OddIndex();
		System.out.println("Enter SIZE");
	int [] arr=new int[scan.nextInt()];
	System.out.println("Enter Elemnts");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	
	
odd.oddIndex(arr);
	}

}
