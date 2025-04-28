package com.arrays1;

public class SmallestNumber {

	public static void main(String[] args) {
		int []a={11,22,33,44,551,1,2,3};
		//fetching yhe data
		System.out.println("Printing array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Logic
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest number: ");
	System.out.println(min);
	}
}
