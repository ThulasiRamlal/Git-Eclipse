package com.singleDimensionalArrays;

public class Maxnumber {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,10,3,4,6};
		System.out.println("Fetching ORGINAL Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Fetching The MAXIMUM Number");
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{	
				if(max<arr[i])
				{
					max=arr[i];
				}	
			
		}
		System.out.println(max);
		
	}

}
