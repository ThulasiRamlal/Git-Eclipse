package com.arrays2;

public class AcendingorderArray {
	public static void main(String[] args) {
		int [] a= {99,22,101,11,2,34,5};
		//fetching the Input data
		System.out.println("printing Input data: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// Ascending order Sorting logic
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("printing Ascending order: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}

}
