package com.arrays1;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
	int [] a= {11,42,13,4,55,86,71111};
	//fetching the data
	System.out.println("Printing the Before Ascending: ");
	System.out.println(Arrays.toString(a));
	
	//Logic for ascending
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=1;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		}
	}
	System.out.println("After Ascending order: ");
	//fetching the data in Ascending order
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}
