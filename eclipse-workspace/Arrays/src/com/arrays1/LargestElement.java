package com.arrays1;

public class LargestElement {
	public static void main(String[] args) {
		int [] a= {11,22,99,33,44,99,77,101};
		//fetching the array
		System.out.println("Printing the array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//Logic
		System.out.println();
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			
				if(a[i]>max)
				{
					max=a[i];
				}
				//System.out.println(max+" ");
		}
		System.out.println("Prinrtng largest number: ");
		System.out.println(max);
		
	}

}
