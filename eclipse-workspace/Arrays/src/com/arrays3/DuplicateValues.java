package com.arrays3;

public class DuplicateValues {
	public static void main(String[] args) {
		int a[]= {1,2,32,3,4};
	// fetching normal data
		System.out.println("Normal array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("For fetching after Duplicate values");
		for(int  i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
				
			}
		}
		
		{
			System.out.println("no duplicate values");
		}
	}

}
