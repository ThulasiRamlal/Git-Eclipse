package com.arrays1;

public class EvenPosition {
	public static void main(String[] args) {
		
		int [] a= {0,1,2,3,4,5,6,7,8,9};
		//Fetching th data
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Printing even positions: ");
		//Logic
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
			
	}

}
