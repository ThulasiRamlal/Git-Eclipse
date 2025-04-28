package com.arrays;



public class SumOfArray {
	
	public static void main(String[] args) {
		int n[]= {1,2,3,4,5,6,7,8,9};
		//fetching the Orinal Array
		
		System.out.println("Fetching the ORIGINAL Array");
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
			
		}
		System.out.println("Sum OF ARRAY: "+sum);
		
		
	}

}
