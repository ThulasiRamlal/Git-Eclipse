package com.arrays2;

public class ReverseOrder5 {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		System.out.println("Orginal Order: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse order: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
