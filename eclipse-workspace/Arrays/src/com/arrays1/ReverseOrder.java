package com.arrays1;

public class ReverseOrder {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		//fetching the data
		System.out.println("Printint before reverse: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Logic of Reverse
		System.out.println("Printing after reverse: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

}
}
