package com.arrays;

import java.util.Arrays;

public class ReverseOrder {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		//fetching the Orginal Array
		System.out.println("Fetching the ORGINAL array");
		System.out.println(Arrays.toString(a));
		//Reverse Lo gic Code
		System.out.println("REVERSE The Array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	
		
		
		
	}

}
