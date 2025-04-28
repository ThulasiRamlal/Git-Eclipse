package com.arrays2;

public class LargestElement {
	public static void main(String[] args) {
		int [] arr= {10,12,1,75,22,44,100};
		//fetching the Input
		System.out.println("printing Input:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//fetching th Largest element
		System.out.println("Printing the largest element: ");
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element: "+max);
	}

}
