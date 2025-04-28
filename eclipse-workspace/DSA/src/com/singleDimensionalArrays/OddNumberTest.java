package com.singleDimensionalArrays;

import java.util.Scanner;

public class OddNumberTest {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter SIZE");
		int [] arr= new int[scan.nextInt()];
		System.out.println("Enter Elemnts");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Fetching the ORGINAL data");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		OddNumber odd=new OddNumber();
		odd.odd(arr);
	
}
}
