package com.binarySearch;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elemnets");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Printing Orginal Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Enter Key For Searching");
		int key=scan.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			int low=arr[0];
			int high=arr.length-1;
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key Found");
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
				
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		
		
	}

}
