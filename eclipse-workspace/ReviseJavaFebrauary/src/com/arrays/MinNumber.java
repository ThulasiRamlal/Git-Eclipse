package com.arrays;

public class MinNumber {
	public static void main(String[] args) {
		
		int []a= {1,2,12,3,4,5,2,10};
		//fetching the orginal array
		System.out.println("Fetching The Orginal Array");
		//business logic of to find the smallest Number
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
			}
						
		}
		System.out.println("SMALLEST NUMBER: "+min);
		
		
	}

}
