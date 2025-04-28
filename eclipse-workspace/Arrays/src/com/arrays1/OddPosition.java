package com.arrays1;

public class OddPosition {
public static void main(String[] args) {
	int[] a= {2,3,4,5,6,77,8,8};
	//fetching the data
	System.out.println("printng the Array: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	//fetching the odd positions
	System.out.println("Printing the Odd Position: ");
	for(int i=1;i<a.length;i=i+2)
	{
		System.out.print(a[i]+" ");
	}
}
}
