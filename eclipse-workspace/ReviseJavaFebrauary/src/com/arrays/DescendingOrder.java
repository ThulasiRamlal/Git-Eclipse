package com.arrays;

public class DescendingOrder {
	public static void main(String[] args) {
		
		int a[]= {33,211,3,455,3553};
		//fetching the orginal Array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//business logic for descending order
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//fetching descending order
		
		System.out.println("Fetching the descending order in array elements...");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
		
		
		
	}

}
