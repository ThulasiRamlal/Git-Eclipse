package com.arrays1;

import java.util.Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		System.out.println("printing input elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Total sum of ARray: ");
		//Logic of Sum
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	
	}

}
