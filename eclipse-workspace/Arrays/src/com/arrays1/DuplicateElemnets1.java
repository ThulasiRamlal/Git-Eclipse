package com.arrays1;

public class DuplicateElemnets1 {
	public static void main(String[] args) {
		int [] a= {1,2,3,33,44,33,44,55};
		//fetching the data
		System.out.println("printing INput: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Duplicate Logic
		//fetching the duplicate data
				System.out.println("Duplicate elements: ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
	
	

