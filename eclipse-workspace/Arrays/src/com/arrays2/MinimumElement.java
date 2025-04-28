package com.arrays2;

public class MinimumElement {
	public static void main(String[] args) {
		int[] arr= {11,1,22,33,4455,8383,0
				};
		//fetchin Input Data
		System.out.println("Printing Input Data");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Fetching the Smallest element in array
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Largest element: "+min);
	}

}
