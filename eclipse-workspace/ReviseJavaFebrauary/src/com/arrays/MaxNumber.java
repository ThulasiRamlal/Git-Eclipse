package com.arrays;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		int []a= {1,2,12,3,4,5,2,10};
		//feching the orginal array
		System.out.println("Fetching the ORIGINAL ARRAY");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//business logic of MAx Number
		System.out.println();
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("LARGEST NUMBER: "+max);
		
		
	}

}
