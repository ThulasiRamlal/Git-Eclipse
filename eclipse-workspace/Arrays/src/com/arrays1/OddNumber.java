package com.arrays1;

public class OddNumber {
	public static void main(String[] args) {
		int [] a= {11,22,33,44,55,66,77,888,9999,1000};
		//fetching the data
		System.out.println("Print the Input: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Logic for odd
System.out.println("Printing Odd: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
