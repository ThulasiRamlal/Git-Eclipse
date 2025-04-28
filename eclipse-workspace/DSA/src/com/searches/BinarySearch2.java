package com.searches;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int a[]=new int[scan.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter elemnt "+i+" index");
			a[i]=scan.nextInt();
		}
		
		System.out.println("Original Elemnts");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Sorting IN Original Array");
		Arrays.sort(a);
	   for(int i:a)
	    {
		System.out.print(i+" ");
	   }
	   System.out.println();
	   System.out.println("Binary Search Start");
	   
	   System.out.println("Enter KEY For search");
	   int key=scan.nextInt();
	   boolean flag=false;
	   int l=0;
	   int h=a.length-1;
	   while(l<=h)
	   {
		   int mid=(l+h)/2;
		   if(key==a[mid])
		   {
			   System.out.println("Element found.."+a[mid]);
			   flag=true;
			   break;
		   }
		   if(key>a[mid])
		   {
			   l=mid+1;
		   }
		   if(key<a[mid])
		   {
			   h=mid-1;
		   }
		   
	   }
	   if(flag==false)
	   {
		   System.out.println("Element not found");
	   }
	   
	}

}
