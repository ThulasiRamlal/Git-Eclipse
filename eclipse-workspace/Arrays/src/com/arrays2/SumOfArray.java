package com.arrays2;

public class SumOfArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,22,44};
		//fetching the Input data
		System.out.println("Printing Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum=0;
		//fetching the total sum of array
		System.out.println("Printng total Sum of array: ");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
	    
		}
		System.out.println("sum: "+sum);
	}

}
