package com.selectionSort;

import java.util.Scanner;

public class SelectionSort1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size array");
		int arr[] =new int[scan.nextInt()];
		System.out.println("enter "+arr.length+" elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Original array");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
